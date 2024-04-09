package edu.java.WebClients.webClientsWithRetry.stackOverflow;

import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.stackoverflow.StackOverflowResponse;
import edu.java.configuration.RetryConfig;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class StackOverflowClientWithLinearRetries extends StackOverflowClientWithRetries {

    public StackOverflowClientWithLinearRetries(
        StackOverflowClientInBeanConfiguration baseClient,
        RetryConfig retryConfig
    ) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<StackOverflowResponse<StackOverflowQuestionBody>> findQuestionById(long id) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.findQuestionById(id).getBody()
            )
        );

    }

    @Override
    public Mono<StackOverflowResponse<StackOverflowAnswer>> findAnswerByQuestionId(long id) {

        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.findAnswersByQuestionId(id).getBody()
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
