package edu.java.bot.scrapper.webClients.scrapperWithRetries.links;

import edu.java.bot.configuration.RetryConfig;
import edu.java.bot.scrapper.dto.request.AddLinkRequest;
import edu.java.bot.scrapper.dto.request.RemoveLinkRequest;
import edu.java.bot.scrapper.dto.response.LinkResponse;
import edu.java.bot.scrapper.dto.response.ListLinksResponse;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperLinksClient;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class ScrapperLinksClientWithConstantRetries extends ScrapperLinksClientWithRetries {
    public ScrapperLinksClientWithConstantRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<ListLinksResponse> findTrackedLinks(long chatId) {
        return performActionWithConstantRetry(() -> baseClient.findTrackedLinks(chatId).getBody());
    }

    @Override
    public Mono<LinkResponse> trackLink(AddLinkRequest addLinkRequest, long chatId) {
        return performActionWithConstantRetry(() -> baseClient.trackLink(chatId, addLinkRequest).getBody());
    }

    @Override
    public Mono<LinkResponse> untrackLink(RemoveLinkRequest removeLinkRequest, long chatId) {
        return performActionWithConstantRetry(() -> baseClient.untrackLink(chatId, removeLinkRequest).getBody());
    }

    private <T> Mono<T> performActionWithConstantRetry(Supplier<T> action) {
        return Mono.fromCallable(action::get)
            .retryWhen(
                Retry.fixedDelay(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
