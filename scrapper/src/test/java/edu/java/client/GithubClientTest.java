package edu.java.client;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
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

@WireMockTest(httpPort = 8080)
class GitHubClientTest {
    private final GithubClient githubClient = new GithubClient(WebClient.create("http://localhost:8080"));

    @Test
    @DisplayName("When API call fails should throw ApiErrorException")
    void whenApiCallFailsShouldThrowApiErrorException() {
        stubFor(get(urlEqualTo("/repos/owner/repo"))
            .willReturn(aResponse()
                .withStatus(500)));

        StepVerifier.create(githubClient.getRepositoryInfo("owner", "repo"))
            .expectErrorMessage("Github API error with status code 500")
            .verify();
    }

    @Test
    @DisplayName("When API returns invalid JSON should throw DecodingException")
    void whenApiReturnsInvalidJsonShouldThrowJsonProcessingException() {
        stubFor(get(urlEqualTo("/repos/owner/repo"))
            .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("invalid json")
                .withStatus(200)));

        StepVerifier.create(githubClient.getRepositoryInfo("owner", "repo"))
            .expectErrorMatches(throwable -> throwable instanceof DecodingException)
            .verify();
    }

    @Test
    @DisplayName("When API call is successful should return repository info")
    void whenApiCallIsSuccessfulShouldReturnRepositoryInfo() {

        stubFor(get(urlEqualTo("/repos/owner/repo"))
            .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("""
                    {
                        "name": "repository",
                        "owner": {
                            "login": "mario",
                            "id": 62462
                        },
                        "updated_at": "2002-06-13T10:45:34Z"
                    }"""
                )
                .withStatus(200)));

        StepVerifier.create(githubClient.getRepositoryInfo("owner", "repo"))
            .assertNext(response -> {
                assertThat(response.getOwner()).isEqualTo("mario");
                assertThat(response.getName()).isEqualTo("repository");
                assertThat(response.getUpdatedAt()).isEqualTo("2002-06-13T10:45:34Z");
            })
            .verifyComplete();
    }
}
