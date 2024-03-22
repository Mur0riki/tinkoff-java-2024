package edu.java.restApi.dto.request;

import jakarta.validation.constraints.Pattern;

public record AddLinkRequest(
    @Pattern(regexp = "https?://.*")
    String link
) {
}
