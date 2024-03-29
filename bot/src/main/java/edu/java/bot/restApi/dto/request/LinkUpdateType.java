package edu.java.bot.restApi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LinkUpdateType {
    STACK_OVERFLOW_DESCRIPTION("Question body was updated!"),
    STACK_OVERFLOW_ANSWERS("Answers set was updated!"),
    GIT_HUB_REPOSITORY_DESCRIPTION("New update in repository!"),
    GIT_HUB_REPOSITORY_ACTIVITIES("New activity in repository!");

    private final String message;
}
