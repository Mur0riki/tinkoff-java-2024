package edu.java.restApi.dto.response;

import java.util.List;

public record ListLinksResponse(
    List<LinkResponse> links,
    int size
) {

}
