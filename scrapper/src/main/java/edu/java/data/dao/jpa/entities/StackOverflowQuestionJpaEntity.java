package edu.java.data.dao.jpa.entities;

import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "stack_overflow_questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StackOverflowQuestionJpaEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "link_id", referencedColumnName = "id")
    private LinkJpaEntity link;

    @Column(name = "last_activity_date", columnDefinition = "TIMESTAMP")
    private Instant lastActivityDate = Instant.now();

    @Type(ListArrayType.class)
    @Column(name = "answers_ids", columnDefinition = "bigint[]")
    private List<Long> answersIds;
}
