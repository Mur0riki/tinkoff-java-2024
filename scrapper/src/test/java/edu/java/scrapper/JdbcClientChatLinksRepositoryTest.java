package edu.java.scrapper;

import edu.java.data.postgres.entities.ChatLink;
import edu.java.data.postgres.repositories.ChatLinksRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.ChatLinkRowMapper;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class JdbcClientChatLinksRepositoryTest extends JdbcIntegrationEnvironment {

    static final RowMapper<ChatLink> ROW_MAPPER = new ChatLinkRowMapper();

    @Autowired @Qualifier("jdbcClientChatLinksRepository")
    ChatLinksRepository chatLinksRepository;

    @Test
    public void should_save() {
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");
        ChatLink chatLink = new ChatLink(1, 1);

        chatLinksRepository.save(chatLink);

        Optional<ChatLink> actualChatLink =
            jdbcTemplate.query("SELECT * FROM chat_links", ROW_MAPPER).stream().findFirst();
        assertThat(actualChatLink).isPresent();
    }

    @Test
    public void should_findByChatId() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (2,'2022-06-16 16:37:23')");

        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://link2','2022-06-16 16:37:23')");

        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,2,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (2,1,'2022-06-16 16:37:23')");

        //Act
        List<Long> actualLinkIds = chatLinksRepository.findByChatId(1)
            .stream().map(ChatLink::getLinkId).toList();

        //Assert
        assertThat(actualLinkIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_findByLinkId() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (2,'2022-06-16 16:37:23')");

        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://link2','2022-06-16 16:37:23')");

        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (2,1,'2022-06-16 16:37:23')");
        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id, created_at) VALUES (1,2,'2022-06-16 16:37:23')");

        //Act
        List<Long> actualChatIds = chatLinksRepository.findByLinkId(1)
            .stream().map(ChatLink::getChatId).toList();

        //Assert
        assertThat(actualChatIds).isNotNull().hasSize(2).containsExactlyInAnyOrder(1L, 2L);
    }

    @Test
    public void should_removeByChatIdAndLinkId() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");

        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://link1','2022-06-16 16:37:23')");

        jdbcTemplate.update("INSERT INTO chat_links (chat_id, link_id,created_at) VALUES (1,1,'2022-06-16 16:37:23')");

        //Act
        boolean actualResponse = chatLinksRepository.removeByChatIdAndLinkId(1, 1);

        //Assert
        assertThat(actualResponse).isTrue();

        Optional<ChatLink> actualChatLink =
            jdbcTemplate.query("SELECT * FROM chat_links", ROW_MAPPER).stream().findFirst();
        assertThat(actualChatLink).isEmpty();
    }
}
