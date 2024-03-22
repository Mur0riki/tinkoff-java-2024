package edu.java.WebClients.dto.telegrambot.request;

import java.net.URI;
import java.util.List;

public record LinkUpdate(
    int id,
    URI url,
    String description,
    List<Integer> tgChatIds
) {
}
