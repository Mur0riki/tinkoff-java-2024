package edu.java.bot.scrapper.webClients.scrapperWithRetries.telegramChat;

import edu.java.bot.configuration.RetryConfig;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperTelegramChatClient;
import reactor.core.publisher.Mono;

public class ScrapperTelegramChatClientWithLinearRetries extends ScrapperTelegramChatClientWithRetries {

    public ScrapperTelegramChatClientWithLinearRetries(ScrapperTelegramChatClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<Void> registerNewChat(long id) {
        return Mono.fromRunnable(
            () -> performWithLinearRetry(
                () -> baseClient.registerNewChat(id)
            )
        );
    }

    @Override
    public Mono<Void> deleteChat(long id) {
        return Mono.fromRunnable(
            () -> performWithLinearRetry(
                () -> baseClient.deleteChat(id)
            )
        );
    }

    private void performWithLinearRetry(Runnable action) {

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
