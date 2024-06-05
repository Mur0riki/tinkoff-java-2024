package edu.java.data.dto;

import java.time.OffsetDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class GitHubRepositoryEntity {

    @Id
    long id;
    long linkId;
    String name;
    String owner;
    OffsetDateTime updatedAt;
    Set<Long> activitiesIds;

}
