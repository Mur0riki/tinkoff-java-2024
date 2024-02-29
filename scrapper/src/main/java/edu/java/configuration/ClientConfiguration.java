package edu.java.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfiguration {
    private static final String CONTENT_TYPE = "Content-Type";

    @Bean
    public WebClient stackOverFlowWebClient(ApplicationConfig applicationConfig) {
        return WebClient.builder()
            .baseUrl(applicationConfig.baseStackOverflowUrl().getBaseUrl())
            .defaultHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();
    }

    @Bean
    public WebClient githubWebClient(ApplicationConfig applicationConfig) {
        return WebClient.builder()
            .baseUrl(applicationConfig.baseGitHubUrl().getBaseUrl())
            .defaultHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();
    }
}
