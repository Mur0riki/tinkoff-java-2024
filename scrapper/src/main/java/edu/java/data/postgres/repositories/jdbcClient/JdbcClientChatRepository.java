package edu.java.data.postgres.repositories.jdbcClient;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.repositories.ChatRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.ChatRowMapper;
import java.sql.PreparedStatement;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JdbcClientChatRepository implements ChatRepository {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String TABLE_NAME = "chat";
    private static final RowMapper<Chat> ROW_MAPPER = new ChatRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} (id, created_at) VALUES (:id, :created_at)";

    private static final String FIND_BY_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE id = :id";

    private static final String DELETE_BY_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE id = :id";

    private final JdbcClient jdbcClient;

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public void save(Chat chat) {
        jdbcClient.sql(SAVE_QUERY)
            .param("id", chat.getId())
            .param("created_at", chat.getCreatedAt())
            .update();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public Optional<Chat> findById(long id) {
        return jdbcClient.sql(FIND_BY_ID_QUERY)
            .param("id", id)
            .query(ROW_MAPPER)
            .optional();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public boolean removeById(long id) {
        return jdbcClient.sql(DELETE_BY_ID_QUERY)
            .param("id", id)
            .update() != 0;
    }
}
