package edu.java.WebClients;

import edu.java.WebClients.dto.github.GitHubRepositoryActivity;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

public interface GitHubClientInBeanConfiguration {

    @GetExchange(url = "/repos/{owner}/{repoName}")
    ResponseEntity<GitHubRepositoryBody> findRepository(@PathVariable String repoName, @PathVariable String owner);

    @GetExchange(url = "/repos/{owner}/{repoName}/activity")
    ResponseEntity<List<GitHubRepositoryActivity>> findRepositoryActivities(
        @PathVariable String repoName,
        @PathVariable String owner
    );
}
