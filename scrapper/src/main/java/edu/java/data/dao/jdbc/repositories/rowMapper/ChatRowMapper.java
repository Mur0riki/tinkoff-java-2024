package edu.java.data.dao.jdbc.repositories.rowMapper;

import edu.java.data.dto.Chat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

public class ChatRowMapper implements RowMapper<Chat> {

    @Override
    public Chat mapRow(ResultSet rs, int rowNum) throws SQLException {
        long id = rs.getLong("id");
        LocalDateTime createdAt = rs.getTimestamp("created_at").toLocalDateTime();

        return new Chat(id, createdAt);
    }
}
