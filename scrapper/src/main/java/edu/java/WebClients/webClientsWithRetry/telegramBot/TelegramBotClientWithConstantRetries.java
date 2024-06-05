package edu.java.WebClients.webClientsWithRetry.telegramBot;

import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.configuration.RetryConfig;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class TelegramBotClientWithConstantRetries extends TelegramBotClientWithRetries {

    public TelegramBotClientWithConstantRetries(
        TelegramBotClientInBeanConfiguration baseClient,
        RetryConfig retryConfig
    ) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates) {
        return Mono.fromRunnable(() -> baseClient.sendLinkUpdate(linkUpdates))
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            ).then();
    }
}
