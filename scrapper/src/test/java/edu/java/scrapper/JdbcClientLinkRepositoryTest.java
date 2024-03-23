package edu.java.scrapper;

import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.LinkRepository;
import edu.java.data.postgres.repositories.jdbcClient.rowMappers.LinkRowMapper;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import static org.assertj.core.api.Assertions.assertThat;

class JdbcClientLinkRepositoryTest extends JdbcIntegrationEnvironment {

    static final RowMapper<Link> ROW_MAPPER = new LinkRowMapper();

    @Autowired @Qualifier("jdbcClientLinkRepository")
    LinkRepository linkRepository;

    @Test
    public void should_save() {
        Link link = new Link(URI.create("https://link"), LocalDateTime.now());

        linkRepository.save(link);

        Optional<Link> actualLink =
            jdbcTemplate.query("SELECT * FROM links", ROW_MAPPER).stream().findFirst();
        assertThat(actualLink).isPresent();
    }

    @Test
    public void should_findById() {
        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://url','2022-06-16 16:37:23')");

        Link actualLink = linkRepository.findById(1L).get();

        assertThat(actualLink.getUrl()).hasToString("https://url");
    }

    @Test
    public void should_returnEmptyOptional_when_cantFindLink() {
        Optional<Link> actualLink = linkRepository.findById(1L);

        assertThat(actualLink).isEmpty();
    }

    @Test
    public void should_findByUrl() {
        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://url','2022-06-16 16:37:23')");

        Link actualLink = linkRepository.findByUrl("https://url").get();

        assertThat(actualLink.getCreatedAt()).isEqualTo(LocalDateTime.parse("2022-06-16T16:37:23"));
    }

    @Test
    public void should_removeById() {
        //Arrange
        jdbcTemplate.update("INSERT INTO links (url, created_at) VALUES ('https://url','2022-06-16 16:37:23')");

        //Act
        boolean actualResponse = linkRepository.removeById(1L);

        //Assert
        assertThat(actualResponse).isTrue();

        Optional<Link> actualLink =
            jdbcTemplate.query("SELECT * FROM links", ROW_MAPPER).stream().findFirst();
        assertThat(actualLink).isEmpty();
    }

}
