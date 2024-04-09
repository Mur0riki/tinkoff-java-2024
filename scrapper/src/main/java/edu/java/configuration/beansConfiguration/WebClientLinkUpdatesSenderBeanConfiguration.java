package edu.java.configuration.beansConfiguration;

import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.response.TelegramBotApiErrorResponse;
import edu.java.WebClients.exception.ClientErrorException;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithConstantRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithExponentialRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithLinearRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithRetries;
import edu.java.configuration.ApplicationConfig;
import edu.java.linkUpdateScheduler.linkUpdateSender.LinkUpdatesSender;
import edu.java.linkUpdateScheduler.linkUpdateSender.WebClientLinkUpdatesSender;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "useQueue", havingValue = "false")
@RequiredArgsConstructor
public class WebClientLinkUpdatesSenderBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Bean
    public LinkUpdatesSender linkUpdatesSender() {
        return new WebClientLinkUpdatesSender(telegramBotClientInBeanConfiguration());
    }

    @Bean
    public TelegramBotClientInBeanConfiguration telegramBotClientInBeanConfiguration() {
        String baseUrl = applicationConfig.telegramBotConfig().getBaseUrl();
        WebClient webClient = WebClient.builder()
            .defaultStatusHandler(HttpStatusCode::is4xxClientError, response ->
                response.bodyToMono(TelegramBotApiErrorResponse.class)
                    .flatMap(errorBody -> Mono.error(new ClientErrorException(errorBody))))
            .baseUrl(baseUrl)
            .build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
        return factory.createClient(TelegramBotClientInBeanConfiguration.class);
    }

    @Bean
    public TelegramBotClientWithRetries telegramBotClientWithRetries() {
        var retryConfig = applicationConfig.stackOverflowConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new TelegramBotClientWithConstantRetries(telegramBotClientInBeanConfiguration(), retryConfig);
            case LINEAR -> new TelegramBotClientWithLinearRetries(telegramBotClientInBeanConfiguration(), retryConfig);
            case EXPONENTIAL -> new TelegramBotClientWithExponentialRetries(telegramBotClientInBeanConfiguration(), retryConfig);
        };
    }

}
