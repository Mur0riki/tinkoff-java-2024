package edu.java.data.dao.interfaces;

import edu.java.data.dto.Link;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

public interface LinkDataAccessObject {

    Optional<Link> findByUrl(URI url);

    Optional<Link> findById(long id);

    Link saveOrFindByUrl(URI url);

    Set<Link> findByLastCheckedAtBefore(LocalDateTime borderDateTime);

    Set<Long> findAssociatedChatsIdsByLinkId(long id);

    void updateLastCheckedAtById(LocalDateTime lastChecked, long id);
}
