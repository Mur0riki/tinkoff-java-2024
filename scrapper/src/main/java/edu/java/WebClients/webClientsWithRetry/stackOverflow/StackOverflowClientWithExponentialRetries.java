package edu.java.WebClients.webClientsWithRetry.stackOverflow;

import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.stackoverflow.StackOverflowResponse;
import edu.java.configuration.RetryConfig;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class StackOverflowClientWithExponentialRetries extends StackOverflowClientWithRetries {

    public StackOverflowClientWithExponentialRetries(
        StackOverflowClientInBeanConfiguration baseClient,
        RetryConfig retryConfig
    ) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<StackOverflowResponse<StackOverflowQuestionBody>> findQuestionById(long id) {
        return Mono.fromCallable(() -> baseClient.findQuestionById(id).getBody())
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );

    }

    @Override
    public Mono<StackOverflowResponse<StackOverflowAnswer>> findAnswerByQuestionId(long id) {
        return Mono.fromCallable(() -> baseClient.findAnswersByQuestionId(id).getBody())
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
