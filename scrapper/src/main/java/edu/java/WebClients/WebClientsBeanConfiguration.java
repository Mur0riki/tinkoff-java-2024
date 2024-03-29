package edu.java.WebClients;

import edu.java.WebClients.dto.telegrambot.response.TelegramBotApiErrorResponse;
import edu.java.WebClients.exception.ClientErrorException;
import edu.java.configuration.ApplicationConfig;
import org.apache.commons.lang3.StringUtils;
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
        WebClient webClient = WebClient.builder().baseUrl(getStackOverflowBaseUrl()).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(StackOverflowClientInBeanConfiguration.class);
    }

    private String getStackOverflowBaseUrl() {
        String defaultUrl = applicationConfig.stackOverflowUrl().getBaseUrl();
        String configUrl = applicationConfig.stackOverflowUrl().configUrl();
        String str = "nothing";
        if (StringUtils.isBlank(applicationConfig.stackOverflowUrl().configUrl())) {
            return defaultUrl;
        }
        return configUrl;
    }

    @Bean
    public GitHubClientInBeanConfiguration gitHubClientInBeanConfiguration() {
        WebClient webClient = WebClient.builder().baseUrl(getGitHubBaseUrl()).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(GitHubClientInBeanConfiguration.class);
    }

    private String getGitHubBaseUrl() {
        String defaultUrl = applicationConfig.gitHubUrl().getBaseUrl();
        String configUrl = applicationConfig.gitHubUrl().configUrl();
        if (StringUtils.isBlank(applicationConfig.gitHubUrl().configUrl())) {
            return defaultUrl;
        }
        return configUrl;
    }

    @Bean
    public TelegramBotClientInBeanConfiguration telegramBotClient() {
        String baseUrl = applicationConfig.telegramBotUrl().getBaseUrl();
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
}
