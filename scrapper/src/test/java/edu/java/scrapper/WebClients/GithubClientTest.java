package edu.java.scrapper.WebClients;

import com.github.dockerjava.transport.DockerHttpClient;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubOwner;
import edu.java.WebClients.dto.github.GitHubRepository;
import edu.java.WebClients.dto.github.GitHubRepositoryVisibilityType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.codec.DecodingException;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.test.StepVerifier;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.assertj.core.api.Assertions.assertThat;

@WireMockTest(httpPort = 8075)
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest
@TestPropertySource("classpath:application-test.yml")
@ActiveProfiles("test")
class GithubClientTest {
    @Autowired
    GitHubClientInBeanConfiguration gitHubClient;
    @Test
    @DisplayName("When API call is successful should return repository info")
    void whenApiCallIsSuccessfulShouldReturnRepositoryInfo() {
        stubFor(get((urlEqualTo("Mur0riki/tinkoff-java-2024")))
            .willReturn(aResponse().withBody("""
                {
                    "id": 755058420,
                    "node_id": "R_kgDOLQFG9A",
                    "name": "tinkoff-java-2024",
                    "full_name": "Mur0riki/tinkoff-java-2024",
                    "private": false,
                    "owner": {
                        "login": "Mur0riki",
                        "id": 71519989,
                        "node_id": "MDQ6VXNlcjcxNTE5OTg5",
                        "avatar_url": "https://avatars.githubusercontent.com/u/71519989?v=4",
                        "gravatar_id": "",
                        "url": "https://api.github.com/users/Mur0riki",
                        "html_url": "https://github.com/Mur0riki",
                        "followers_url": "https://api.github.com/users/Mur0riki/followers",
                        "following_url": "https://api.github.com/users/Mur0riki/following{/other_user}",
                        "gists_url": "https://api.github.com/users/Mur0riki/gists{/gist_id}",
                        "starred_url": "https://api.github.com/users/Mur0riki/starred{/owner}{/repo}",
                        "subscriptions_url": "https://api.github.com/users/Mur0riki/subscriptions",
                        "organizations_url": "https://api.github.com/users/Mur0riki/orgs",
                        "repos_url": "https://api.github.com/users/Mur0riki/repos",
                        "events_url": "https://api.github.com/users/Mur0riki/events{/privacy}",
                        "received_events_url": "https://api.github.com/users/Mur0riki/received_events",
                        "type": "User",
                        "site_admin": false
                    },
                    "html_url": "https://github.com/Mur0riki/tinkoff-java-2024",
                    "description": null,
                    "fork": false,
                    "url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024",
                    "forks_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/forks",
                    "keys_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/keys{/key_id}",
                    "collaborators_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/collaborators{/collaborator}",
                    "teams_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/teams",
                    "hooks_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/hooks",
                    "issue_events_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/issues/events{/number}",
                    "events_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/events",
                    "assignees_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/assignees{/user}",
                    "branches_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/branches{/branch}",
                    "tags_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/tags",
                    "blobs_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/git/blobs{/sha}",
                    "git_tags_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/git/tags{/sha}",
                    "git_refs_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/git/refs{/sha}",
                    "trees_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/git/trees{/sha}",
                    "statuses_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/statuses/{sha}",
                    "languages_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/languages",
                    "stargazers_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/stargazers",
                    "contributors_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/contributors",
                    "subscribers_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/subscribers",
                    "subscription_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/subscription",
                    "commits_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/commits{/sha}",
                    "git_commits_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/git/commits{/sha}",
                    "comments_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/comments{/number}",
                    "issue_comment_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/issues/comments{/number}",
                    "contents_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/contents/{+path}",
                    "compare_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/compare/{base}...{head}",
                    "merges_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/merges",
                    "archive_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/{archive_format}{/ref}",
                    "downloads_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/downloads",
                    "issues_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/issues{/number}",
                    "pulls_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/pulls{/number}",
                    "milestones_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/milestones{/number}",
                    "notifications_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/notifications{?since,all,participating}",
                    "labels_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/labels{/name}",
                    "releases_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/releases{/id}",
                    "deployments_url": "https://api.github.com/repos/Mur0riki/tinkoff-java-2024/deployments",
                    "created_at": "2024-02-09T10:59:30Z",
                    "updated_at": "2024-02-09T11:05:15Z",
                    "pushed_at": "2024-03-10T11:58:47Z",
                    "git_url": "git://github.com/Mur0riki/tinkoff-java-2024.git",
                    "ssh_url": "git@github.com:Mur0riki/tinkoff-java-2024.git",
                    "clone_url": "https://github.com/Mur0riki/tinkoff-java-2024.git",
                    "svn_url": "https://github.com/Mur0riki/tinkoff-java-2024",
                    "homepage": null,
                    "size": 172,
                    "stargazers_count": 0,
                    "watchers_count": 0,
                    "language": "Java",
                    "has_issues": true,
                    "has_projects": true,
                    "has_downloads": true,
                    "has_wiki": true,
                    "has_pages": false,
                    "has_discussions": false,
                    "forks_count": 0,
                    "mirror_url": null,
                    "archived": false,
                    "disabled": false,
                    "open_issues_count": 2,
                    "license": null,
                    "allow_forking": true,
                    "is_template": false,
                    "web_commit_signoff_required": false,
                    "topics": [],
                    "visibility": "public",
                    "forks": 0,
                    "open_issues": 2,
                    "watchers": 0,
                    "default_branch": "master",
                    "temp_clone_token": null,
                    "network_count": 0,
                    "subscribers_count": 1
                }
                """))
        );

        ResponseEntity<GitHubRepository> actualResponse =
            gitHubClient.findRepository("Mur0riki","tinkoff-java-2024");
        GitHubRepository expectedResponse = new GitHubRepository(
            755058420,"tinkoff-java-2024",null,
            new GitHubOwner(71519989,"Mur0riki"),
            "https://api.github.com/repos/Mur0riki/tinkoff-java-2024",
            "Java",
            GitHubRepositoryVisibilityType.PUBLIC,
            OffsetDateTime.ofInstant(Instant.parse("2024-02-09T10:59:30Z"), ZoneOffset.UTC),
            OffsetDateTime.ofInstant(Instant.parse("2024-02-09T11:05:15Z"),ZoneOffset.UTC),
            OffsetDateTime.ofInstant(Instant.parse("2024-03-10T11:58:47Z"),ZoneOffset.UTC),
            1,false);
        assertThat(actualResponse.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(actualResponse.getBody()).isNotNull();
        assertThat(actualResponse.getBody().id()).isEqualTo(expectedResponse.id());
        assertThat(actualResponse.getBody().createdAt()).isEqualTo(expectedResponse.createdAt());
        assertThat(actualResponse.getBody().url()).isEqualTo(expectedResponse.url());
        assertThat(actualResponse.getBody().pushedAt()).isEqualTo(expectedResponse.pushedAt());
        assertThat(actualResponse.getBody().description()).isEqualTo(expectedResponse.description());
        assertThat(actualResponse.getBody().archived()).isEqualTo(expectedResponse.archived());
    }
}
