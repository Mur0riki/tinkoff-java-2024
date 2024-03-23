package edu.java.scrapper.WebClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import edu.java.WebClients.GitHubClientInBeanConfiguration;
import edu.java.WebClients.dto.github.GitHubOwner;
import edu.java.WebClients.dto.github.GitHubRepositoryBody;
import edu.java.WebClients.dto.github.GitHubRepositoryVisibilityType;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
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
        stubFor(get((urlEqualTo("Mur0riki/newRepository")))
            .willReturn(aResponse().withBody("""
                {
                    "id": 701477800,
                    "node_id": "R_kgDOKc-zqA",
                    "name": "newRepository",
                    "full_name": "Mur0riki/newRepository",
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
                    "html_url": "https://github.com/Mur0riki/newRepository",
                    "description": null,
                    "fork": false,
                    "url": "https://api.github.com/repos/Mur0riki/newRepository",
                    "forks_url": "https://api.github.com/repos/Mur0riki/newRepository/forks",
                    "keys_url": "https://api.github.com/repos/Mur0riki/newRepository/keys{/key_id}",
                    "collaborators_url": "https://api.github.com/repos/Mur0riki/newRepository/collaborators{/collaborator}",
                    "teams_url": "https://api.github.com/repos/Mur0riki/newRepository/teams",
                    "hooks_url": "https://api.github.com/repos/Mur0riki/newRepository/hooks",
                    "issue_events_url": "https://api.github.com/repos/Mur0riki/newRepository/issues/events{/number}",
                    "events_url": "https://api.github.com/repos/Mur0riki/newRepository/events",
                    "assignees_url": "https://api.github.com/repos/Mur0riki/newRepository/assignees{/user}",
                    "branches_url": "https://api.github.com/repos/Mur0riki/newRepository/branches{/branch}",
                    "tags_url": "https://api.github.com/repos/Mur0riki/newRepository/tags",
                    "blobs_url": "https://api.github.com/repos/Mur0riki/newRepository/git/blobs{/sha}",
                    "git_tags_url": "https://api.github.com/repos/Mur0riki/newRepository/git/tags{/sha}",
                    "git_refs_url": "https://api.github.com/repos/Mur0riki/newRepository/git/refs{/sha}",
                    "trees_url": "https://api.github.com/repos/Mur0riki/newRepository/git/trees{/sha}",
                    "statuses_url": "https://api.github.com/repos/Mur0riki/newRepository/statuses/{sha}",
                    "languages_url": "https://api.github.com/repos/Mur0riki/newRepository/languages",
                    "stargazers_url": "https://api.github.com/repos/Mur0riki/newRepository/stargazers",
                    "contributors_url": "https://api.github.com/repos/Mur0riki/newRepository/contributors",
                    "subscribers_url": "https://api.github.com/repos/Mur0riki/newRepository/subscribers",
                    "subscription_url": "https://api.github.com/repos/Mur0riki/newRepository/subscription",
                    "commits_url": "https://api.github.com/repos/Mur0riki/newRepository/commits{/sha}",
                    "git_commits_url": "https://api.github.com/repos/Mur0riki/newRepository/git/commits{/sha}",
                    "comments_url": "https://api.github.com/repos/Mur0riki/newRepository/comments{/number}",
                    "issue_comment_url": "https://api.github.com/repos/Mur0riki/newRepository/issues/comments{/number}",
                    "contents_url": "https://api.github.com/repos/Mur0riki/newRepository/contents/{+path}",
                    "compare_url": "https://api.github.com/repos/Mur0riki/newRepository/compare/{base}...{head}",
                    "merges_url": "https://api.github.com/repos/Mur0riki/newRepository/merges",
                    "archive_url": "https://api.github.com/repos/Mur0riki/newRepository/{archive_format}{/ref}",
                    "downloads_url": "https://api.github.com/repos/Mur0riki/newRepository/downloads",
                    "issues_url": "https://api.github.com/repos/Mur0riki/newRepository/issues{/number}",
                    "pulls_url": "https://api.github.com/repos/Mur0riki/newRepository/pulls{/number}",
                    "milestones_url": "https://api.github.com/repos/Mur0riki/newRepository/milestones{/number}",
                    "notifications_url": "https://api.github.com/repos/Mur0riki/newRepository/notifications{?since,all,participating}",
                    "labels_url": "https://api.github.com/repos/Mur0riki/newRepository/labels{/name}",
                    "releases_url": "https://api.github.com/repos/Mur0riki/newRepository/releases{/id}",
                    "deployments_url": "https://api.github.com/repos/Mur0riki/newRepository/deployments",
                    "created_at": "2023-10-06T18:09:49Z",
                    "updated_at": "2023-10-06T18:23:49Z",
                    "pushed_at": "2023-12-15T02:23:24Z",
                    "git_url": "git://github.com/Mur0riki/newRepository.git",
                    "ssh_url": "git@github.com:Mur0riki/newRepository.git",
                    "clone_url": "https://github.com/Mur0riki/newRepository.git",
                    "svn_url": "https://github.com/Mur0riki/newRepository",
                    "homepage": null,
                    "size": 177,
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

        ResponseEntity<GitHubRepositoryBody> actualResponse =
            gitHubClient.findRepository("Mur0riki", "newRepository");
        GitHubRepositoryBody expectedResponse = new GitHubRepositoryBody(
            701477800, "newRepository", null,
            new GitHubOwner(71519989, "Mur0riki"),
            "https://api.github.com/repos/Mur0riki/newRepository",
            "Java",
            GitHubRepositoryVisibilityType.PUBLIC,
            OffsetDateTime.ofInstant(Instant.parse("2023-10-06T18:09:49Z"), ZoneOffset.UTC),
            OffsetDateTime.ofInstant(Instant.parse("2023-10-06T18:23:49Z"), ZoneOffset.UTC),
            OffsetDateTime.ofInstant(Instant.parse("2023-12-15T02:23:24Z"), ZoneOffset.UTC),
            1, false
        );
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
