package edu.java.data.dao.initialStateScreeners;

import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.configuration.ApplicationConfig;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dto.GitHubRepositoryEntity;
import edu.java.data.dto.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.linkUpdateScheduler.exceptions.UnsuccessfulGitHubUrlParseException;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GitHubInitialStateScreener implements InitialStateScreener {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final Pattern REPOSITORY_NAME_OWNER_PATTERN = Pattern.compile("github.com/([^/]+)/([^/]+)$");

    private final ApplicationConfig applicationConfig;
    private final GitHubClientInBeanConfiguration gitHubClient;
    private final GitHubRepositoryDataAccessObject gitHubRepositoryDao;

    @Override
    public void saveInitialState(Link link) {
        URI url = link.getUrl();
        String hostName = url.getHost();
        if (!hostName.equals("github.com")) {
            throw new IncorrectHostException(hostName);
        }

        RepositoryAndOwner repositoryAndOwner = extractRepositoryAndOwner(link.getUrl());
        String repositoryName = repositoryAndOwner.repositoryName;
        String owner = repositoryAndOwner.ownerName;

        GitHubRepositoryBody repositoryBody = gitHubClient.findRepository(repositoryName, owner).getBody();
        var repository =buildRepositoryEntity(repositoryBody, link.getId());
        gitHubRepositoryDao.save(repository);
    }

    private RepositoryAndOwner extractRepositoryAndOwner(URI url) {
        Matcher matcher = REPOSITORY_NAME_OWNER_PATTERN.matcher(url.toString());
        if (matcher.find()) {
            String owner = matcher.group(1);
            String repository = matcher.group(2);
            return new RepositoryAndOwner(repository, owner);
        } else {
            throw new UnsuccessfulGitHubUrlParseException(url);
        }
    }

    private GitHubRepositoryEntity buildRepositoryEntity(GitHubRepositoryBody repositoryBody, long linkId) {
        long id = repositoryBody.id();
        String name = repositoryBody.name();
        String owner = repositoryBody.owner().login();
        OffsetDateTime updatedAt = repositoryBody.updatedAt();
        Set<Long> activities = fetchActivitiesIds(name, owner);

        return new GitHubRepositoryEntity(
            id,
            linkId,
            name,
            owner,
            updatedAt,
            activities
        );
    }

    private Set<Long> fetchActivitiesIds(String repositoryName, String owner) {
        return gitHubClient
            .findRepositoryActivities(repositoryName, owner)
            .getBody()
            .stream()
            .map(GitHubRepositoryActivity::id)
            .collect(Collectors.toSet());
    }

    private record RepositoryAndOwner(
        String repositoryName,
        String ownerName
    ) {
    }
}
