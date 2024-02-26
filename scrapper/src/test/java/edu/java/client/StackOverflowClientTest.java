package edu.java.client;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.client.dto.StackOverflowQuestionResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.core.codec.DecodingException;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.test.StepVerifier;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThat;

@WireMockTest(httpPort = 8075)
class StackOverflowClientTest {
    private final StackOverflowClient stackOverflowClient =
        new StackOverflowClient(WebClient.create("http://localhost:8075"));

    @Test
    @DisplayName("When API call fails should throw ApiErrorException")
    void whenApiCallFailsShouldThrowApiErrorException() {
        stubFor(get(urlEqualTo("/questions/1?site=stackoverflow"))
            .willReturn(aResponse()
                .withStatus(500)));

        StepVerifier.create(stackOverflowClient.getQuestionsInfo(1L))
            .expectErrorMessage("Stackoverflow API error with status code 500")
            .verify();
    }

    @Test
    @DisplayName("when API returns invalid JSON should throw DecodingException")
    void whenApiReturnsInvalidJsonShouldThrowJsonProcessingException() {
        stubFor(get(urlEqualTo("/questions/1?site=stackoverflow"))
            .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("invalid json")
                .withStatus(200)));

        StepVerifier.create(stackOverflowClient.getQuestionsInfo(1L))
            .expectErrorMatches(throwable -> throwable instanceof DecodingException)
            .verify();
    }

    @Test
    @DisplayName("when API call is successful Should return question info")
    void whenApiCallIsSuccesfulShouldReturnQuestionInfo() {
        stubFor(get(urlEqualTo("/questions/1?site=stackoverflow"))
            .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody(
                    """
                        {
                            "items": [
                                {
                                    "tags": [
                                    ],
                                    "owner": {
                                        "display_name": "Not Me"
                                    },
                                    "last_activity_date": 1550236327,
                                    "title": "is it worth?",
                                    "question_id": 1
                                }
                            ]
                        }"""
                )
                .withStatus(200)));
        StepVerifier.create(stackOverflowClient.getQuestionsInfo(1))
            .assertNext(response -> {
                    assertThat(response.getQuestions()).hasSize(1);
                    StackOverflowQuestionResponse.QuestionResponse question = response.questions.getFirst();
                    assertThat(question.getOwner()).isEqualTo("Not Me");
                    assertThat(question.getUpdatedAt()).isEqualTo("2019-02-15T13:12:07Z");
                    assertThat(question.getTitle()).isEqualTo("is it worth?");
                }
            ).verifyComplete();
    }
}
