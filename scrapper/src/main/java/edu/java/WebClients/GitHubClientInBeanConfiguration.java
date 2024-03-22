package edu.java.WebClients;

import edu.java.WebClients.dto.github.GitHubRepository;
import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface GitHubClientInBeanConfiguration {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    ResponseEntity<GitHubRepository> findRepository(@PathVariable String owner, @PathVariable String repoName);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    ResponseEntity<List<GitHubRepositoryActivity>> findRepositoryActivities(
        @PathVariable String owner,
        @PathVariable String repoName
    );
}
