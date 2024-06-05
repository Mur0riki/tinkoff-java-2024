package edu.java.WebClients.webClientsWithRetry.telegramBot;

import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.configuration.RetryConfig;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class TelegramBotClientWithExponentialRetries extends TelegramBotClientWithRetries {

    public TelegramBotClientWithExponentialRetries(
        TelegramBotClientInBeanConfiguration baseClient,
        RetryConfig retryConfig
    ) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates) {
        return Mono.fromRunnable(() -> baseClient.sendLinkUpdate(linkUpdates))
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
