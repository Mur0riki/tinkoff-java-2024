package edu.java.WebClients;

import edu.java.configuration.ApplicationConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientsBeanConfiguration {

    private final ApplicationConfig applicationConfig;

    @Autowired
    public WebClientsBeanConfiguration(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @Bean
    public StackOverflowClient stackOverflowClient() {
        WebClient webClient = WebClient.builder().baseUrl(getStackOverflowBaseUrl()).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(StackOverflowClient.class);
    }

    private String getStackOverflowBaseUrl() {
        String defaultUrl = applicationConfig.baseStackOverflowUrl().getBaseUrl();
        String configUrl = applicationConfig.baseStackOverflowUrl().configUrl();
        if (StringUtils.isBlank(applicationConfig.baseStackOverflowUrl().configUrl())) {
            return defaultUrl;
        }
        return configUrl;
    }

    @Bean
    public GitHubClient gitHubClient() {
        WebClient webClient = WebClient.builder().baseUrl(getGitHubBaseUrl()).build();
        WebClientAdapter adapter = WebClientAdapter.create(webClient);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        return factory.createClient(GitHubClient.class);
    }

    private String getGitHubBaseUrl() {
        String defaultUrl = applicationConfig.baseGitHubUrl().getBaseUrl();
        String configUrl = applicationConfig.baseGitHubUrl().configUrl();
        if (StringUtils.isBlank(applicationConfig.baseGitHubUrl().configUrl())) {
            return defaultUrl;
        }
        return configUrl;
    }
}
