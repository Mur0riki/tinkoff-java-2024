package edu.java.data.postgres.entities;

import java.net.URI;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Link {

    @Id
    private long id;
    private URI url;
    private LocalDateTime createdAt;
    private LocalDateTime lastCheckedAt;

    public Link(URI url, LocalDateTime createdAt) {
        this.url = url;
        this.createdAt = createdAt;
        this.lastCheckedAt = LocalDateTime.MIN;
    }

    public Link(URI url) {
        this(url, LocalDateTime.now());
    }
}
