package edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub;

import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.data.dto.GitHubRepositoryEntity;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GitHubRepositoryActivitiesUpdateChecker implements GitHubRepositorySingleUpdateChecker {

    private final GitHubClientInBeanConfiguration gitHubClient;

    @Override
    public LinkUpdateType getType() {
        return LinkUpdateType.GIT_HUB_REPOSITORY_ACTIVITIES;
    }

    @Override
    public boolean hasUpdate(GitHubRepositoryEntity oldState, GitHubRepositoryBody newState) {
        Set<Long> oldActivities = oldState.getActivitiesIds();
        Set<Long> newActivities = fetchActivitiesIds(newState.name(), newState.owner().login());

        return !oldActivities.equals(newActivities);
    }

    private Set<Long> fetchActivitiesIds(String name, String owner) {
        return gitHubClient
            .findRepositoryActivities(name,owner)
            .getBody()
            .stream()
            .map(GitHubRepositoryActivity::id)
            .collect(Collectors.toSet());
    }

}
