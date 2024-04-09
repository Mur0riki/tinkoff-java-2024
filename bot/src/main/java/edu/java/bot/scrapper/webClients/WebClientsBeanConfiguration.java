package edu.java.bot.scrapper.webClients;

import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.scrapper.dto.response.ScrapperApiErrorResponse;
import edu.java.bot.scrapper.exceptions.ClientErrorException;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.links.ScrapperLinksClientWithConstantRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.links.ScrapperLinksClientWithExponentialRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.links.ScrapperLinksClientWithLinearRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.links.ScrapperLinksClientWithRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.telegramChat.ScrapperTelegramChatClientWithConstantRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.telegramChat.ScrapperTelegramChatClientWithExponentialRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.telegramChat.ScrapperTelegramChatClientWithLinearRetries;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.telegramChat.ScrapperTelegramChatClientWithRetries;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;

@Configuration
public class WebClientsBeanConfiguration {

    private final ApplicationConfig applicationConfig;
    private static HttpServiceProxyFactory scrapperWebClientsFactory;

    @Autowired
    public WebClientsBeanConfiguration(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @PostConstruct
    private void init() {
        String baseUrl = applicationConfig.scrapperUrl().getBaseUrl();
        WebClient webClient = WebClient.builder()
            .defaultStatusHandler(HttpStatusCode::is4xxClientError, response ->
                response.bodyToMono(ScrapperApiErrorResponse.class)
                    .flatMap(errorBody -> Mono.error(new ClientErrorException(errorBody)))
            )
            .baseUrl(baseUrl)
            .build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        scrapperWebClientsFactory = HttpServiceProxyFactory.builderFor(adapter).build();
    }
    @Bean
    public ScrapperTelegramChatClientWithRetries scrapperTelegramChatClientWithRetries() {
        var retryConfig = applicationConfig.scrapperRetryConfig();

        return switch (retryConfig.type()) {
            case CONSTANT ->
                new ScrapperTelegramChatClientWithConstantRetries(scrapperTelegramChatClient(), retryConfig);
            case LINEAR -> new ScrapperTelegramChatClientWithLinearRetries(scrapperTelegramChatClient(), retryConfig);
            case EXPONENTIAL ->
                new ScrapperTelegramChatClientWithExponentialRetries(scrapperTelegramChatClient(), retryConfig);
        };
    }
    @Bean
    public ScrapperLinksClientWithRetries scrapperLinksClientWithRetries() {
        var retryConfig = applicationConfig.scrapperRetryConfig();

        return switch (retryConfig.type()) {
            case CONSTANT -> new ScrapperLinksClientWithConstantRetries(scrapperLinksClient(), retryConfig);
            case LINEAR -> new ScrapperLinksClientWithLinearRetries(scrapperLinksClient(), retryConfig);
            case EXPONENTIAL -> new ScrapperLinksClientWithExponentialRetries(scrapperLinksClient(), retryConfig);
        };
    }

    @Bean
    public ScrapperTelegramChatClient scrapperTelegramChatClient() {
        return scrapperWebClientsFactory.createClient(ScrapperTelegramChatClient.class);
    }

    @Bean
    public ScrapperLinksClient scrapperLinksClient() {
        return scrapperWebClientsFactory.createClient(ScrapperLinksClient.class);
    }
}
