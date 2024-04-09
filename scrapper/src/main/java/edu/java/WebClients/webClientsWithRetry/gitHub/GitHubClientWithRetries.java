package edu.java.WebClients.webClientsWithRetry.gitHub;

import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.WebClients.webClientsWithRetry.WebClientWithRetries;
import edu.java.configuration.RetryConfig;
import java.util.List;
import reactor.core.publisher.Mono;

public abstract class GitHubClientWithRetries extends WebClientWithRetries<GitHubClientInBeanConfiguration> {

    public GitHubClientWithRetries(GitHubClientInBeanConfiguration baseClient, RetryConfig retryConfig) {
        super(baseClient, retryConfig);
    }

    public abstract Mono<GitHubRepositoryBody> findRepository(String repoName, String owner);

    public abstract Mono<List<GitHubRepositoryActivity>> findRepositoryActivities(
        String repoName,
        String owner
    );
}
