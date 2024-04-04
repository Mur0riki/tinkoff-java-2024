package edu.java.WebClients.webClientsWithRetry.stackOverflow;

import edu.java.WebClients.StackOverflowClientInBeanConfiguration;
import edu.java.WebClients.dto.stackoverflow.StackOverflowAnswer;
import edu.java.WebClients.dto.stackoverflow.StackOverflowQuestionBody;
import edu.java.WebClients.dto.stackoverflow.StackOverflowResponse;
import edu.java.WebClients.webClientsWithRetry.WebClientWithRetries;
import edu.java.configuration.RetryConfig;
import reactor.core.publisher.Mono;

public abstract class StackOverflowClientWithRetries extends
    WebClientWithRetries<StackOverflowClientInBeanConfiguration> {

    public StackOverflowClientWithRetries(StackOverflowClientInBeanConfiguration baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<StackOverflowResponse<StackOverflowQuestionBody>> findQuestionById(long id);

    public abstract Mono<StackOverflowResponse<StackOverflowAnswer>> findAnswerByQuestionId(long id);

}
