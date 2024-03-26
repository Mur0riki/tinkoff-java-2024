package edu.java.restApi.dto.response;

import edu.java.data.postgres.entities.Link;
import java.net.URI;

public record LinkResponse(
    long id,
    URI url
) {
    public LinkResponse(Link link) {
        this(link.getId(), link.getUrl());
    }
}

