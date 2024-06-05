package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chat")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatJpaEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private Instant createdAt = Instant.now();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "chat")
    private Collection<AssociationJpa> associations = new HashSet<>();

    public ChatJpaEntity(long id) {
        this.id = id;
    }

}
