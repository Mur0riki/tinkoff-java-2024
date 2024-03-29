package edu.java.data.dao.jdbc.repositories;

import edu.java.data.dao.jdbc.repositories.rowMapper.LinkRowMapper;
import edu.java.data.dto.Link;
import java.net.URI;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;

@RequiredArgsConstructor
public class LinkJdbcRepository {

    private static final String TABLE_NAME = "link";
    private static final RowMapper<Link> ROW_MAPPER = new LinkRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} (url, created_at) VALUES (:url, :created_at) RETURNING *";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String FIND_BY_URL_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE url = :url";

    private static final String DELETE_BY_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE id = :id";

    private static final String FIND_BY_LAST_CHECK_DELAY_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE last_checked_at < :timestamp";

    private static final String UPDATE_QUERY =
        STR."UPDATE \{TABLE_NAME} SET "
            + "url = :url, "
            + "created_at = :created_at, "
            + "last_checked_at = :last_checked_at "
            + "WHERE id = :id";
    private final JdbcClient jdbcClient;

    @SuppressWarnings("MultipleStringLiterals")
    public Link save(Link link) {
        return jdbcClient.sql(SAVE_QUERY)
            .param("url", link.getUrl().toString())
            .param("created_at", link.getCreatedAt())
            .query(ROW_MAPPER)
            .single();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public void update(Link link) {
        jdbcClient.sql(UPDATE_QUERY)
            .param("id", link.getId())
            .param("url", link.getUrl().toString())
            .param("created_at", link.getCreatedAt())
            .param("last_checked_at", link.getLastCheckedAt())
            .update();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public Set<Link> findByLastCheckedAtBefore(LocalDateTime borderTime) {
        Timestamp sqlTimestamp = Timestamp.valueOf(borderTime);
        return jdbcClient.sql(FIND_BY_LAST_CHECK_DELAY_QUERY)
            .param("timestamp", sqlTimestamp)
            .query(ROW_MAPPER)
            .set();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public Optional<Link> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public Optional<Link> findByUrl(URI url) {
        return jdbcClient.sql(FIND_BY_URL_QUERY)
            .param("url", url)
            .query(ROW_MAPPER)
            .optional();
    }

    @SuppressWarnings("MultipleStringLiterals")
    public boolean removeById(long id) {
        return jdbcClient.sql(DELETE_BY_ID_QUERY)
            .param("id", id)
            .update() != 0;
    }

}
