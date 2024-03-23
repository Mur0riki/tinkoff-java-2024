package edu.java.scrapper;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.repositories.ChatRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.ChatRowMapper;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class JdbcClientChatRepositoryTest extends JdbcIntegrationEnvironment {

    static final RowMapper<Chat> ROW_MAPPER = new ChatRowMapper();

    @Autowired @Qualifier("jdbcClientChatRepository")
    ChatRepository chatRepository;

    @Test
    public void should_save() {
        Chat chat = new Chat(1, LocalDateTime.now());

        chatRepository.save(chat);

        Optional<Chat> actualChat =
            jdbcTemplate.query("SELECT * FROM chats", ROW_MAPPER).stream().findFirst();
        assertThat(actualChat).isPresent();
    }

    @Test
    public void should_findById() {
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");

        Chat actualChat = chatRepository.findById(1L).get();

        assertThat(actualChat.getId()).isEqualTo(1);
    }

    @Test
    public void should_returnEmptyOptional_when_cantFindChat() {
        Optional<Chat> actualChat = chatRepository.findById(1L);

        assertThat(actualChat).isEmpty();
    }

    @Test
    public void should_removeById() {
        //Arrange
        jdbcTemplate.update("INSERT INTO chats (id, created_at) VALUES (1,'2022-06-16 16:37:23')");

        //Act
        boolean actualResponse = chatRepository.removeById(1L);

        //Assert
        assertThat(actualResponse).isTrue();

        Optional<Chat> actualChat =
            jdbcTemplate.query("SELECT * FROM chats", ROW_MAPPER).stream().findFirst();
        assertThat(actualChat).isEmpty();
    }
}
