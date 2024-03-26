package edu.java.bot.scrapper.webClients;

import edu.java.bot.scrapper.dto.request.AddLinkRequest;
import edu.java.bot.scrapper.dto.request.RemoveLinkRequest;
import edu.java.bot.scrapper.dto.response.LinkResponse;
import edu.java.bot.scrapper.dto.response.ListLinksResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange(url = "/links")
@RestController
public interface ScrapperLinksClient {

    @GetExchange
    ResponseEntity<ListLinksResponse> findTrackedLinks(@RequestHeader("Tg-Chat-Id") long chatId);

    @PostExchange
    ResponseEntity<LinkResponse> trackLink(
        @RequestHeader("Tg-Chat-Id") long chatId,
        @RequestBody AddLinkRequest addLinkRequest
    );

    @DeleteExchange
    ResponseEntity<LinkResponse> untrackLink(
        @RequestHeader("Tg-Chat-Id") long chatId,
        @RequestBody RemoveLinkRequest removeLinkRequest
    );
}
