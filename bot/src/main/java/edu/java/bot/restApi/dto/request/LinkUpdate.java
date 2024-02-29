package edu.java.bot.restApi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import java.net.URI;
import java.util.List;

public record LinkUpdate(
    int id,

    @NotBlank
    URI url,

    @NotBlank
    String description,

    @NotEmpty
    List<Integer> tgChatsId
) {
}
