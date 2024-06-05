package edu.java.WebClients.webClientsWithRetry.telegramBot;

import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.WebClients.webClientsWithRetry.WebClientWithRetries;
import edu.java.configuration.RetryConfig;
import java.util.List;
import reactor.core.publisher.Mono;

public abstract class TelegramBotClientWithRetries extends WebClientWithRetries<TelegramBotClientInBeanConfiguration> {

    protected TelegramBotClientWithRetries(TelegramBotClientInBeanConfiguration baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates);

}
