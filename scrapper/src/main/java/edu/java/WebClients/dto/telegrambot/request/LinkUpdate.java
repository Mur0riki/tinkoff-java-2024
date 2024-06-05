package edu.java.WebClients.dto.telegrambot.request;

import java.net.URI;
import java.util.Set;

public record LinkUpdate(
    long id,
    URI url,
    LinkUpdateType description,
    Set<Long> tgChatIds
) {
}
