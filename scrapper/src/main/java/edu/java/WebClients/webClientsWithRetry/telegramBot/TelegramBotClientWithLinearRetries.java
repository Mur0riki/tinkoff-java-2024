package edu.java.WebClients.webClientsWithRetry.telegramBot;

import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.configuration.RetryConfig;
import java.util.List;
import reactor.core.publisher.Mono;

public class TelegramBotClientWithLinearRetries extends TelegramBotClientWithRetries {

    public TelegramBotClientWithLinearRetries(
        TelegramBotClientInBeanConfiguration baseClient,
        RetryConfig retryConfig
    ) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> sendLinkUpdates(List<LinkUpdate> linkUpdates) {
        return Mono.fromRunnable(
            () -> runWithLinearRetry(
                () -> baseClient.sendLinkUpdate(linkUpdates)
            )
        ).then();
    }

    private void runWithLinearRetry(Runnable action) {

        var currentDelay = delay;

        for (int i = 0; i < maxRetries; i++) {

            try {
                action.run();
                return;
            } catch (Exception e) {
                if (!mustBeRetried(e)) {
                    throw e;
                }
            }

            try {
                Thread.sleep(currentDelay.toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            currentDelay = currentDelay.plus(delay);
        }

        action.run();

    }
}
