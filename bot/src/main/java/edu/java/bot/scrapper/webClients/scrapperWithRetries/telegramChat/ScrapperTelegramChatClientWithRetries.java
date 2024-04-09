package edu.java.bot.scrapper.webClients.scrapperWithRetries.telegramChat;

import edu.java.bot.configuration.RetryConfig;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperTelegramChatClient;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class ScrapperTelegramChatClientWithRetries extends WebClientWithRetries<ScrapperTelegramChatClient> {
    public ScrapperTelegramChatClientWithRetries(ScrapperTelegramChatClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<Void> registerNewChat(long id);

    public abstract Mono<Void> deleteChat(long id);
}
