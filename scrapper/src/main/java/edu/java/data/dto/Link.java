package edu.java.data.dto;

import edu.java.data.dao.jpa.entities.utils.mappers.support.Default;
import java.net.URI;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Link {

    @Id
    private long id;
    private URI url;
    private LocalDateTime createdAt;
    private LocalDateTime lastCheckedAt;

    @Default
    public Link(long id, URI url, LocalDateTime createdAt, LocalDateTime lastCheckedAt) {
        this.id = id;
        this.url = url;
        this.createdAt = createdAt;
        this.lastCheckedAt = lastCheckedAt;
    }

    public Link(URI url, LocalDateTime createdAt) {
        this.url = url;
        this.createdAt = createdAt;
        this.lastCheckedAt = LocalDateTime.MIN;
    }

    public Link(URI url) {
        this(url, LocalDateTime.now());
    }
}
