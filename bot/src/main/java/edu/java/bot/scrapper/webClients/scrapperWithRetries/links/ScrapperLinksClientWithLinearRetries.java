package edu.java.bot.scrapper.webClients.scrapperWithRetries.links;

import edu.java.bot.configuration.RetryConfig;
import edu.java.bot.scrapper.dto.request.AddLinkRequest;
import edu.java.bot.scrapper.dto.request.RemoveLinkRequest;
import edu.java.bot.scrapper.dto.response.LinkResponse;
import edu.java.bot.scrapper.dto.response.ListLinksResponse;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperLinksClient;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class ScrapperLinksClientWithLinearRetries extends ScrapperLinksClientWithRetries {

    public ScrapperLinksClientWithLinearRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<ListLinksResponse> findTrackedLinks(long chatId) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.findTrackedLinks(chatId).getBody()
            )
        );
    }

    @Override
    public Mono<LinkResponse> trackLink(AddLinkRequest addLinkRequest, long chatId) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.trackLink(chatId, addLinkRequest).getBody()
            )
        );
    }

    @Override
    public Mono<LinkResponse> untrackLink(RemoveLinkRequest removeLinkRequest, long chatId) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.untrackLink(chatId, removeLinkRequest).getBody()
            )
        );
    }

    private <T> T getWithLinearRetry(Supplier<T> action) {

        var currentDelay = delay;

        for (int i = 0; i < maxRetries; i++) {
            try {
                return action.get();
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

        return action.get();

    }
}
