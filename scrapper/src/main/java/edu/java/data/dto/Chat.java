package edu.java.data.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Chat {

    @Id
    private long id;
    private LocalDateTime createdAt;

    public Chat(long id) {
        this(id, LocalDateTime.now());
    }
}
