package edu.java.WebClients.dto.stackoverflow;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record StackOverflowResponse<T>(
    List<T> items,

    @JsonProperty("has_more")
    boolean hasMore,

    @JsonProperty("quota_max")
    int quotaMax,

    @JsonProperty("quota_remaining")
    int quotaRemaining
) {
}
