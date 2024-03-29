package edu.java.data.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class ChatLink {

    @Id
    private long id;
    private long chatId;
    private long linkId;
    private LocalDateTime createdAt;

    public ChatLink(long chatId, long linkId) {
        this.chatId = chatId;
        this.linkId = linkId;
        this.createdAt = LocalDateTime.now();
    }

}
