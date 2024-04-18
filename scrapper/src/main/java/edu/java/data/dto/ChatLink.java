package edu.java.data.dto;

import edu.java.data.dao.jpa.entities.utils.mappers.support.Default;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ChatLink {

    private long chatId;
    private long linkId;
    private LocalDateTime createdAt;

    @Default
    public ChatLink(long chatId, long linkId, LocalDateTime createdAt) {
        this.chatId = chatId;
        this.linkId = linkId;
        this.createdAt = createdAt;
    }

    public ChatLink(long chatId, long linkId) {
        this.chatId = chatId;
        this.linkId = linkId;
        this.createdAt = LocalDateTime.now();
    }

}
