package edu.java.data.dto;

import java.time.OffsetDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class StackOverflowQuestion {

    @Id
    Long id;
    long linkId;
    OffsetDateTime lastActivityDate;
    Set<Long> answerIds;
}
