package edu.java.scrapper;


import java.net.URI;
import java.util.List;
import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.WebClients.dto.telegrambot.response.TelegramBotApiErrorResponse;
import edu.java.WebClients.exception.ClientErrorException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static com.github.tomakehurst.wiremock.client.WireMock.ok;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.assertj.core.api.Assertions.assertThat;

public class TelegramBotClientTest extends WebClientTest {

    @Autowired
    TelegramBotClientInBeanConfiguration telegramBotClient;

    @Test
    public void should_notThrowException_when_postHttpStatus2xx() {
        mockServer.stubFor(post("/updates")
            .willReturn(ok()));

        LinkUpdate linkUpdate = new LinkUpdate(
            1, URI.create("http://my/link"), LinkUpdateType.GIT_HUB_REPOSITORY_ACTIVITIES, List.of(1L)
        );

        assertDoesNotThrow(() -> telegramBotClient.sendLinkUpdate(List.of(linkUpdate)));
    }

    @Test
    public void should_throwClientErrorException_when_httpStatus4xx() {
        //Arrange
        mockServer.stubFor(post("/updates")
            .willReturn(
                okJson("""
                    {
                        "description": "some description",
                        "code": "400",
                        "exceptionName":"some exception",
                        "exceptionMessage": "some message",
                        "stacktrace":[
                            "frame1",
                            "frame2"
                        ]
                    }"""
                )
                    .withStatus(400)
            )
        );

        //Act, Assert
        TelegramBotApiErrorResponse expectedApiErrorResponse = new TelegramBotApiErrorResponse(
            "some description",
            "400",
            "some exception",
            "some message",
            List.of("frame1", "frame2")
        );

        LinkUpdate linkUpdate = new LinkUpdate(
            1, URI.create("http://my/link"), LinkUpdateType.STACK_OVERFLOW_ANSWERS, List.of(1L)
        );

        assertThatThrownBy(
            () -> telegramBotClient.sendLinkUpdate(List.of(linkUpdate))
        ).isInstanceOf(ClientErrorException.class)
            .satisfies(actualResponse ->
                assertThat(((ClientErrorException) actualResponse).getErrorResponseBody())
                    .isEqualTo(expectedApiErrorResponse)
            );

    }
}
