package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.data.postgres.entities.GitHubRepositoryEntity;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.SingleUpdateChecker;

public interface GitHubRepositorySingleUpdateChecker
    extends SingleUpdateChecker<GitHubRepositoryEntity, GitHubRepositoryBody> {
}
