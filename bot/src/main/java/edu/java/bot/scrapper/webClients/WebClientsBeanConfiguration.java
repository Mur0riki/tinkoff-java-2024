package edu.java.bot.scrapper.webClients;

import edu.java.bot.configuration.ApplicationConfig;
import edu.java.bot.scrapper.dto.response.ScrapperApiErrorResponse;
import edu.java.bot.scrapper.exceptions.ClientErrorException;
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
    public ScrapperTelegramChatClient scrapperTelegramChatClient() {
        return scrapperWebClientsFactory.createClient(ScrapperTelegramChatClient.class);
    }

    @Bean
    public ScrapperLinksClient scrapperLinksClient() {
        return scrapperWebClientsFactory.createClient(ScrapperLinksClient.class);
    }
}
