package edu.java.WebClients.dto.stackoverflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record StackOverflowResponse<T>(
    List<T> items,

    @JsonProperty("has_mor")
    boolean hasMor,

    @JsonProperty("quota_max")
    int quotaMax,

    @JsonProperty("quota_remaining")
    int quotaRemaining
) {
}
