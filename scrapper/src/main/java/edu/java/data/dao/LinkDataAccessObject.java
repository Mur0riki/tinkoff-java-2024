package edu.java.data.dao;

import edu.java.data.postgres.entities.Link;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LinkDataAccessObject {

    Optional<Link> findByUrl(String url);

    Optional<Link> findById(long id);

    Link saveOrFindByUrl(String url);

    Collection<Link> findByLastCheckDelayFromNow(Duration duration);

    List<Long> findAssociatedChatsIdsById(long id);

    void updateLastCheckedById(long id);

    void updateLastCheckedById(long id, LocalDateTime lastChecked);
}
