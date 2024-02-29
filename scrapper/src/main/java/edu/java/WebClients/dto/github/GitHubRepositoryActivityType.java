package edu.java.WebClients.dto.github;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum GitHubRepositoryActivityType {
    PUSH,
    FORCE_PUSH,
    BRANCH_CREATION,
    BRANCH_DELETION,
    PR_MERGE,
    MERGE_QUEUE_MERGE;

    @JsonCreator
    public static GitHubRepositoryActivityType fromString(String text) {
        for (var type : GitHubRepositoryActivityType.values()) {
            if (type.name().equalsIgnoreCase(text)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid RepositoryActivityType:  " + text);
    }
}
