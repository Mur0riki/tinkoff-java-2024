package edu.java.bot.scrapper.webClients.scrapperWithRetries.links;

import edu.java.bot.configuration.RetryConfig;
import edu.java.bot.scrapper.dto.request.AddLinkRequest;
import edu.java.bot.scrapper.dto.request.RemoveLinkRequest;
import edu.java.bot.scrapper.dto.response.LinkResponse;
import edu.java.bot.scrapper.dto.response.ListLinksResponse;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.scrapper.webClients.scrapperWithRetries.WebClientWithRetries;
import reactor.core.publisher.Mono;

public abstract class ScrapperLinksClientWithRetries extends WebClientWithRetries<ScrapperLinksClient> {

    public ScrapperLinksClientWithRetries(ScrapperLinksClient baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<ListLinksResponse> findTrackedLinks(long chatId);

    public abstract Mono<LinkResponse> trackLink(AddLinkRequest addLinkRequest, long chatId);

    public abstract Mono<LinkResponse> untrackLink(RemoveLinkRequest removeLinkRequest, long chatId);

}
