package edu.java.configuration.databaseAccessConfigurations.jdbc;

import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.dao.jdbc.dao.ChatJdbcDAO;
import edu.java.data.dao.jdbc.dao.GitHubRepositoryJdbcDAO;
import edu.java.data.dao.jdbc.dao.LinkJdbcDAO;
import edu.java.data.dao.jdbc.dao.StackOverflowQuestionJdbcDAO;
import edu.java.data.dao.jdbc.repositories.ChatJdbcRepository;
import edu.java.data.dao.jdbc.repositories.ChatLinksJdbcRepository;
import edu.java.data.dao.jdbc.repositories.GitHubRepositoryJdbcRepository;
import edu.java.data.dao.jdbc.repositories.LinkJdbcRepository;
import edu.java.data.dao.jdbc.repositories.StackOverflowQuestionJdbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jdbc")
public class JdbcAccessConfiguration {

    @Bean
    public ChatJdbcRepository chatJdbcRepository(JdbcClient jdbcClient) {
        return  new ChatJdbcRepository(jdbcClient);
    }

    @Bean
    public ChatLinksJdbcRepository chatLinksJdbcRepository(JdbcClient jdbcClient) {
        return new ChatLinksJdbcRepository(jdbcClient);
    }

    @Bean
    public GitHubRepositoryJdbcRepository gitHubRepositoryJdbcRepository(JdbcClient jdbcClient) {
        return new GitHubRepositoryJdbcRepository(jdbcClient);
    }

    @Bean
    public LinkJdbcRepository linkJdbcRepository(JdbcClient jdbcClient) {
        return new LinkJdbcRepository(jdbcClient);
    }

    @Bean
    public StackOverflowQuestionJdbcRepository stackOverflowQuestionJdbcRepository(JdbcClient jdbcClient) {
        return new StackOverflowQuestionJdbcRepository(jdbcClient);
    }

    @Bean
    public ChatJdbcDAO chatJdbcDAO(
        ChatJdbcRepository chatRepository,
        ChatLinksJdbcRepository chatLinksRepository,
        LinkJdbcDAO linkDao
    ) {
        return new ChatJdbcDAO(chatRepository, chatLinksRepository, linkDao);
    }

    @Bean
    public GitHubRepositoryJdbcDAO gitHubRepositoryJdbcDAO(
        GitHubRepositoryJdbcRepository gitHubRepositoryJdbcRepository
    ) {
        return new GitHubRepositoryJdbcDAO(gitHubRepositoryJdbcRepository);
    }

    @Bean
    public LinkJdbcDAO linkJdbcDAO(
        LinkJdbcRepository linkRepository,
        ChatLinksJdbcRepository chatLinksRepository,
        UniversalInitialStateScreener universalInitialStateScreener
    ) {
        return new LinkJdbcDAO(linkRepository, chatLinksRepository, universalInitialStateScreener);
    }

    @Bean
    public StackOverflowQuestionJdbcDAO stackOverflowQuestionJdbcDAO(
        StackOverflowQuestionJdbcRepository questionRepository
    ) {
        return new StackOverflowQuestionJdbcDAO(questionRepository);
    }

}
