package edu.java.data.dao.jpa.repositories;

import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import java.net.URI;
import java.time.Instant;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkJpaRepository extends JpaRepository<LinkJpaEntity, Long> {
    Optional<LinkJpaEntity> findByUrl(URI url);

    Set<LinkJpaEntity> findByLastCheckedAtBefore(Instant lastCheckedAt);

    boolean existsById(Long id);
}
