package edu.java.linkUpdateScheduler.linkUpdatesCheckers.allUpdatesCheckers;

import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdateType;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.GitHubRepositoryEntity;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchGitHubRepositoryException;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.linkUpdateScheduler.exceptions.UnsuccessfulGitHubUrlParseException;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.singleUpdateCheckers.gitHub.GitHubRepositorySingleUpdateChecker;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GitHubAllUpdatesChecker implements LinkAllUpdatesChecker {

    private static final Pattern REPOSITORY_NAME_OWNER_PATTERN = Pattern.compile("github.com/([^/]+)/([^/]+)$");

    private final GitHubRepositoryDataAccessObject repositoryDao;
    private final LinkDataAccessObject linkDao;
    private final GitHubClientInBeanConfiguration gitHubClient;
    private final List<GitHubRepositorySingleUpdateChecker> updateCheckers;

    @Override
    public List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException {
        String hostName = link.getUrl().getHost();
        if (isIncorrectHostName(hostName)) {
            throw new IncorrectHostException(hostName);
        }

        RepositoryNameAndOwner nicknameAndRepository = extractRepositoryNameAndOwner(link.getUrl());
        String repositoryName = nicknameAndRepository.name;
        String owner = nicknameAndRepository.owner;

        GitHubRepositoryEntity oldRepositoryRecord = repositoryDao.findByNameAndOwner(repositoryName, owner)
            .orElseThrow(() -> new NoSuchGitHubRepositoryException(repositoryName, owner));
        GitHubRepositoryBody currentRepositoryBody =
            gitHubClient.findRepository(repositoryName, owner).getBody();

        List<LinkUpdateType> detectedUpdateTypes =
            iterateAllSingleUpdateCheckers(oldRepositoryRecord, currentRepositoryBody);
        if (!detectedUpdateTypes.isEmpty()) {
            updateLocalRecord(currentRepositoryBody, link.getId());
        }

        return buildLinkUpdateList(link, detectedUpdateTypes);
    }

    private List<LinkUpdate> buildLinkUpdateList(Link link, List<LinkUpdateType> updateTypes) {
        Set<Long> chatIds = linkDao.findAssociatedChatsIdsByLinkId(link.getId());
        return updateTypes.stream()
            .map(type ->
                new LinkUpdate(
                    link.getId(),
                    link.getUrl(),
                    type,
                    chatIds
                )
            )
            .toList();
    }

    private boolean isIncorrectHostName(String hostname) {
        return !hostname.equals("github.com");
    }

    private RepositoryNameAndOwner extractRepositoryNameAndOwner(URI url) {
        Matcher matcher = REPOSITORY_NAME_OWNER_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            String owner = matcher.group(1);
            String repositoryName = matcher.group(2);
            return new RepositoryNameAndOwner(repositoryName, owner);
        } else {
            throw new UnsuccessfulGitHubUrlParseException(url);
        }
    }

    private List<LinkUpdateType> iterateAllSingleUpdateCheckers(
        GitHubRepositoryEntity oldRepositoryRecord,
        GitHubRepositoryBody currentRepositoryBody
    ) {
        List<LinkUpdateType> linkUpdateTypes = new ArrayList<>();
        for (var updateChecker : updateCheckers) {
            if (updateChecker.hasUpdate(oldRepositoryRecord, currentRepositoryBody)) {
                linkUpdateTypes.add(updateChecker.getType());
            }
        }
        return linkUpdateTypes;
    }

    private void updateLocalRecord(GitHubRepositoryBody newRepositoryBody, long linkId) {

        long id = newRepositoryBody.id();
        String name = newRepositoryBody.name();
        String owner = newRepositoryBody.owner().login();
        OffsetDateTime updatedAt = newRepositoryBody.updatedAt();
        Set<Long> activities = gitHubClient
            .findRepositoryActivities(name, owner)
            .getBody()
            .stream()
            .map(GitHubRepositoryActivity::id)
            .collect(Collectors.toSet());

        GitHubRepositoryEntity updatedRepository =
            new GitHubRepositoryEntity(
                id,
                linkId,
                name,
                owner,
                updatedAt,
                activities
            );
        repositoryDao.update(updatedRepository);
    }

    private record RepositoryNameAndOwner(
        String name,
        String owner
    ) {
    }
}

