package edu.java.WebClients.webClientsWithRetry.gitHub;

import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.configuration.RetryConfig;
import java.util.List;
import java.util.function.Supplier;
import reactor.core.publisher.Mono;

public class GitHubClientWithLinearRetries extends GitHubClientWithRetries {

    public GitHubClientWithLinearRetries(GitHubClientInBeanConfiguration baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<GitHubRepositoryBody> findRepository(String repoName, String owner) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.findRepository(repoName, owner).getBody()
            )
        );
    }

    @Override
    public Mono<List<GitHubRepositoryActivity>> findRepositoryActivities(
        String repoName,
        String owner
    ) {
        return Mono.fromCallable(
            () -> getWithLinearRetry(
                () -> baseClient.findRepositoryActivities(repoName, owner).getBody()
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
