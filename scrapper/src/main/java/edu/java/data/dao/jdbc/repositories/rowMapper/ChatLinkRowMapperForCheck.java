package edu.java.data.dao.jdbc.repositories.rowMapper;

import edu.java.data.dto.ChatLink;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ChatLinkRowMapperForCheck implements RowMapper<ChatLink> {
    @Override
    public ChatLink mapRow(ResultSet rs, int rowNum) throws SQLException {
        long chatId = rs.getLong("chat_id");
        long linkId = rs.getLong("link_id");

        return new ChatLink(chatId, linkId);
    }
}
