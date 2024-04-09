package edu.java.bot.restApi.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

public record LinkUpdate(

    long id,

    @NotNull
    @Pattern(regexp =
        "https?:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&//=]*)"
    )
    String url,

    @NotNull
    LinkUpdateType type,

    @NotEmpty
    List<Integer> tgChatIds
) implements Serializable {
}
