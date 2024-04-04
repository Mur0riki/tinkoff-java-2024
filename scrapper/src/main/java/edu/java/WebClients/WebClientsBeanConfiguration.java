package edu.java.WebClients;

import edu.java.WebClients.dto.telegrambot.response.TelegramBotApiErrorResponse;
import edu.java.WebClients.exception.ClientErrorException;
import edu.java.WebClients.webClientsWithRetry.gitHub.GitHubClientWithConstantRetries;
import edu.java.WebClients.webClientsWithRetry.gitHub.GitHubClientWithExponentialRetries;
import edu.java.WebClients.webClientsWithRetry.gitHub.GitHubClientWithLinearRetries;
import edu.java.WebClients.webClientsWithRetry.gitHub.GitHubClientWithRetries;
import edu.java.WebClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithConstantRetries;
import edu.java.WebClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithExponentialRetries;
import edu.java.WebClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithLinearRetries;
import edu.java.WebClients.webClientsWithRetry.stackOverflow.StackOverflowClientWithRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithConstantRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithExponentialRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithLinearRetries;
import edu.java.WebClients.webClientsWithRetry.telegramBot.TelegramBotClientWithRetries;
import edu.java.configuration.ApplicationConfig;
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

    @Autowired
    public WebClientsBeanConfiguration(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @Bean
    public StackOverflowClientInBeanConfiguration stackOverflowClientInBeanConfiguration() {
        String baseurl = applicationConfig.stackOverflowConfig().getBaseUrl();
        return createDefaultWebClient(baseurl, StackOverflowClientInBeanConfiguration.class);
    }

    @Bean
    public StackOverflowClientWithRetries stackOverflowClientWithRetries() {
        var retryConfig = applicationConfig.stackOverflowConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT ->
                new StackOverflowClientWithConstantRetries(stackOverflowClientInBeanConfiguration(), retryConfig);
            case LINEAR ->
                new StackOverflowClientWithLinearRetries(stackOverflowClientInBeanConfiguration(), retryConfig);
            case EXPONENTIAL ->
                new StackOverflowClientWithExponentialRetries(stackOverflowClientInBeanConfiguration(), retryConfig);
        };
    }

    @Bean
    public GitHubClientInBeanConfiguration gitHubClientInBeanConfiguration() {
        String baseUrl = applicationConfig.gitHubConfig().getBaseUrl();
        return createDefaultWebClient(baseUrl, GitHubClientInBeanConfiguration.class);
    }

    @Bean
    public GitHubClientWithRetries gitHubClientWithRetries() {
        var retryConfig = applicationConfig.gitHubConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new GitHubClientWithConstantRetries(gitHubClientInBeanConfiguration(), retryConfig);
            case LINEAR -> new GitHubClientWithLinearRetries(gitHubClientInBeanConfiguration(), retryConfig);
            case EXPONENTIAL -> new GitHubClientWithExponentialRetries(gitHubClientInBeanConfiguration(), retryConfig);
        };
    }

    @Bean
    public TelegramBotClientInBeanConfiguration telegramBotClient() {
        String baseUrl = applicationConfig.telegramBotConfig().url().defaultUrl();
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
        var retryConfig = applicationConfig.telegramBotConfig().retryConfig();
        var type = retryConfig.type();

        return switch (type) {
            case CONSTANT -> new TelegramBotClientWithConstantRetries(telegramBotClient(), retryConfig);
            case LINEAR -> new TelegramBotClientWithLinearRetries(telegramBotClient(), retryConfig);
            case EXPONENTIAL -> new TelegramBotClientWithExponentialRetries(telegramBotClient(), retryConfig);
        };
    }

    private <T> T createDefaultWebClient(String url, Class<T> webClientInterface) {
        WebClient webClient = WebClient.builder()
            .baseUrl(url)
            .build();

        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(webClientInterface);
    }
}
