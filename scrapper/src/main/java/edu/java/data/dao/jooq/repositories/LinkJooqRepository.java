package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.Link;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import static edu.java.scrapper.domain.jooq.Tables.LINK;

@RequiredArgsConstructor
public class LinkJooqRepository {

    private final DefaultDSLContext dsl;

    public Link save(Link link) {
        return dsl.insertInto(LINK)
            .set(LINK.URL, link.getUrl().toString())
            .set(LINK.CREATED_AT, link.getCreatedAt())
            .set(LINK.LAST_CHECKED_AT, link.getLastCheckedAt())
            .returning()
            .fetchOneInto(Link.class);
    }

    public Set<Link> findByLastCheckedAtBefore(LocalDateTime borderDateTime) {
        return dsl.select()
            .from(LINK)
            .where(LINK.LAST_CHECKED_AT.lessThan(borderDateTime))
            .fetchStreamInto(Link.class)
            .collect(Collectors.toSet());
    }

    public void update(Link link) {
        dsl.update(LINK)
            .set(LINK.URL, link.getUrl().toString())
            .set(LINK.CREATED_AT, link.getCreatedAt())
            .set(LINK.LAST_CHECKED_AT, link.getLastCheckedAt())
            .where(LINK.ID.eq(link.getId()))
            .execute();
    }

    public Optional<Link> findById(long id) {
        Link link = dsl.select()
            .from(LINK)
            .where(LINK.ID.eq(id))
            .fetchOneInto(Link.class);
        return Optional.ofNullable(link);
    }

    public Optional<Link> findByUrl(URI url) {
        Link link = dsl.select()
            .from(LINK)
            .where(LINK.URL.eq(url.toString()))
            .fetchOneInto(Link.class);
        return Optional.ofNullable(link);
    }

    public boolean removeById(long id) {
        return dsl.delete(LINK)
            .where(LINK.ID.eq(id))
            .execute() != 0;
    }
}

