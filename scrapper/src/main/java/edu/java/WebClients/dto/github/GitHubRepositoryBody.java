package edu.java.WebClients.dto.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public record GitHubRepositoryBody(
    long id,

    String name,

    String description,

    GitHubOwner owner,

    String htmlUrl,

    String language,

    GitHubRepositoryVisibilityType visibility,

    @JsonProperty("created_at")
    OffsetDateTime createdAt,

    @JsonProperty("updated_at")
    OffsetDateTime updatedAt,

    @JsonProperty("pushed_at")
    OffsetDateTime pushedAt,

    @JsonProperty("subscribers_count")
    int subscribersCount,

    boolean archived

) {
}
