package edu.java.WebClients.webClientsWithRetry.gitHub;

import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.configuration.RetryConfig;
import java.util.List;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

public class GitHubClientWithExponentialRetries extends GitHubClientWithRetries {

    public GitHubClientWithExponentialRetries(GitHubClientInBeanConfiguration baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    @Override
    public Mono<GitHubRepositoryBody> findRepository(String repoName, String owner) {
        return Mono.fromCallable(() -> baseClient.findRepository(repoName, owner).getBody())
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }

    @Override
    public Mono<List<GitHubRepositoryActivity>> findRepositoryActivities(
        String repoName,
        String owner
    ) {
        return Mono.fromCallable(() -> baseClient.findRepositoryActivities(repoName, owner).getBody())
            .retryWhen(
                Retry.backoff(maxRetries, delay)
                    .filter(this::mustBeRetried)
            );
    }
}
