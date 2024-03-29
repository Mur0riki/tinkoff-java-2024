package edu.java.data.dao.jdbc.repositories;

import edu.java.data.dto.ChatLink;
import edu.java.data.dao.jdbc.repositories.rowMapper.ChatLinksRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.ChatLinkRowMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.JdbcClient;
import static java.lang.StringTemplate.STR;

@RequiredArgsConstructor
public class ChatLinksJdbcRepository implements ChatLinksRepository {

    private static final String TABLE_NAME = "link_chat";
    private static final RowMapper<ChatLink> ROW_MAPPER = new ChatLinkRowMapper();

    private static final String SAVE_QUERY =
        STR."INSERT INTO \{TABLE_NAME} (chat_id, link_id,created_at) VALUES (:chat_id, :link_id, :created_at)";

    private static final String FIND_BY_CHAT_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE chat_id = :chat_id";

    private static final String FIND_BY_LINK_ID_QUERY =
        STR."SELECT * FROM \{TABLE_NAME} WHERE link_id = :link_id";

    private static final String DELETE_BY_CHAT_ID_AND_LINK_ID_QUERY =
        STR."DELETE FROM \{TABLE_NAME} WHERE chat_id = :chat_id AND link_id = :link_id";

    private final JdbcClient jdbcClient;

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public void save(ChatLink chatLink) {
        jdbcClient.sql(SAVE_QUERY)
            .param("chat_id", chatLink.getChatId())
            .param("link_id", chatLink.getLinkId())
            .param("created_at", chatLink.getCreatedAt())
            .update();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public List<ChatLink> findByChatId(long chatId) {
        return jdbcClient.sql(FIND_BY_CHAT_ID_QUERY)
            .param("chat_id", chatId)
            .query(ROW_MAPPER)
            .list();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public List<ChatLink> findByLinkId(long linkId) {
        return jdbcClient.sql(FIND_BY_LINK_ID_QUERY)
            .param("link_id", linkId)
            .query(ROW_MAPPER)
            .list();
    }

    @Override
    @SuppressWarnings("MultipleStringLiterals")
    public boolean removeByChatIdAndLinkId(long chatId, long linkId) {
        return jdbcClient.sql(DELETE_BY_CHAT_ID_AND_LINK_ID_QUERY)
            .param("chat_id", chatId)
            .param("link_id", linkId)
            .update() != 0;
    }
}
