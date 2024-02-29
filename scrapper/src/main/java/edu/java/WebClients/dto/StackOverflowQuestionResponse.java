package edu.java.WebClients.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class StackOverflowQuestionResponse {
    @JsonProperty("items")
    public List<QuestionResponse> questions;

    @Getter
    public static class QuestionResponse {
        public String owner;
        @JsonProperty("title")
        public String title;
        @JsonProperty("last_activity_date")
        public OffsetDateTime updatedAt;

        @JsonProperty("owner")
        public void setOwner(Map<String, String> owner) {
            this.owner = owner.get("display_name");
        }
    }
}
