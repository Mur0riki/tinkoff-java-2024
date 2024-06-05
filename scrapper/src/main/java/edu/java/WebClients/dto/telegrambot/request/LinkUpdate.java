package edu.java.WebClients.dto.telegrambot.request;

import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Set;

public record LinkUpdate(
    long id,
    URI url,
    @NotNull
    LinkUpdateType description,
    Set<Long> tgChatIds
) {
}
