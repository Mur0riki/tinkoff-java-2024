package edu.java.bot.scrapper.dto.response;

import java.net.URI;

public record LinkResponse(
    int id,
    URI url
) {
}
