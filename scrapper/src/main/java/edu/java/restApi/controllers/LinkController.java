package edu.java.restApi.controllers;

import edu.java.restApi.dto.request.AddLinkRequest;
import edu.java.restApi.dto.request.RemoveLinkRequest;
import edu.java.restApi.dto.response.LinkResponse;
import edu.java.restApi.dto.response.ListLinksResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scrapper/api/v1/links")
public class LinkController {

    private static Logger LOGGER = LogManager.getLogger();

    @GetMapping
    public ResponseEntity<ListLinksResponse> getTrackedLinksByChatId(@RequestHeader("Tg-Chat-Id") @Min(0) int chatId) {
        LOGGER.debug("Returning all subscribed links. Chat id: %d",chatId);
        return ResponseEntity.ok(new ListLinksResponse(
            List.of(new LinkResponse(1, "some/link")),
            1
        ));
    }

    @PostMapping
    public ResponseEntity<LinkResponse> addLinkToTrack(
        @RequestHeader("Tg-Chat-Id") @Min(0) int chatId,
        @Valid @RequestBody AddLinkRequest addLinkRequest
    ) {
        LOGGER.debug("Adding new link (%s) to track by chat with id %d",addLinkRequest.link(),chatId);
        return ResponseEntity.ok(new LinkResponse(1, addLinkRequest.link()));
    }

    @DeleteMapping
    public ResponseEntity<LinkResponse> deleteTrackedLink(
        @RequestHeader("Tg-Chat-Id") @Min(0) int chatId,
        @Valid @RequestBody RemoveLinkRequest removeLinkRequest
    ) {
        LOGGER.debug("Delete link %s from tracking of chat with id %d",removeLinkRequest.link(),chatId);
        return ResponseEntity.ok(new LinkResponse(1, "example/link"));
    }

}
