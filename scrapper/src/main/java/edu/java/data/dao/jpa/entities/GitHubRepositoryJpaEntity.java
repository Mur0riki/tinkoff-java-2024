package edu.java.data.dao.jpa.entities;

import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "git_hub_repositories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GitHubRepositoryJpaEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "link_id", referencedColumnName = "id")
    private LinkJpaEntity link;

    @Column(name = "name")
    private String name;

    @Column(name = "owner")
    private String owner;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    private OffsetDateTime updated_at;

    @Type(ListArrayType.class)
    @Column(name = "activities_ids", columnDefinition = "bigint[]")
    private List<Long> activitiesIds;

}
