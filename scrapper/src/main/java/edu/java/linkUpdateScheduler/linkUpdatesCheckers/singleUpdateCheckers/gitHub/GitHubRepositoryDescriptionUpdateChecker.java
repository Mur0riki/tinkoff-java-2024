package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.data.dto.GitHubRepositoryEntity;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import org.springframework.stereotype.Component;

@Component
public class GitHubRepositoryDescriptionUpdateChecker implements GitHubRepositorySingleUpdateChecker {
    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_DESCRIPTION;
    }

    @Override
    public boolean hasUpdate(GitHubRepositoryEntity oldState, GitHubRepositoryBody newState) {
        int oldTime = oldState.getUpdatedAt().hashCode();
        int newTime = newState.updatedAt().hashCode();
//        OffsetDateTime oldTime = oldState.getUpdatedAt();
//        OffsetDateTime newTime = newState.updatedAt();
        return !(oldTime == newTime);
    }
}
