package edu.java.data.postgres.repositories.jdbcClient.rowMappers;

import edu.java.data.postgres.entities.ChatLink;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

public class ChatLinkRowMapper implements RowMapper<ChatLink> {
    @Override
    public ChatLink mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        long chatId = rs.getLong("chat_id");
        long linkId = rs.getLong("link_id");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();

        return new ChatLink(id, chatId, linkId, createdAt);
    }
}
