package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.HashSet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "link")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LinkJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "url")
    private URI url;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Instant createdAt = Instant.now();

    @Column(name = "last_checked_at", columnDefinition = "TIMESTAMP") @SuppressWarnings("MagicNumber")
    private Instant lastCheckedAt = LocalDateTime.of(1970, 1, 1, 0, 0).toInstant(ZoneOffset.UTC);

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "link")
    private Collection<AssociationJpa> associations = new HashSet<>();

    public LinkJpaEntity(URI url) {
        this.url = url;
    }

}
