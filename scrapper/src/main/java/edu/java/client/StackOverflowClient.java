package edu.java.client;

import edu.java.client.dto.StackOverflowQuestionResponse;
import edu.java.client.exception.ApiErrorException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class StackOverflowClient {
    private final WebClient stackOverFlowWebClient;

    public Mono<StackOverflowQuestionResponse> getQuestionsInfo(long id) {
        return stackOverFlowWebClient.get()
            .uri("/questions/{id}?site=stackoverflow", id)
            .retrieve()
            .onStatus(
                status -> status.is4xxClientError() || status.is5xxServerError(),
                clientResponse -> Mono.error(
                    new ApiErrorException(
                            "Stackoverflow API error", clientResponse.statusCode().value()
                        ))
            ).bodyToMono(StackOverflowQuestionResponse.class);
    }
}
