package edu.java.WebClients.dto.telegrambot.request;

import java.net.URI;
import java.util.List;

public record LinkUpdate(
    long id,
    URI url,
    LinkUpdateType description,
    List<Long> tgChatIds
) {
}
