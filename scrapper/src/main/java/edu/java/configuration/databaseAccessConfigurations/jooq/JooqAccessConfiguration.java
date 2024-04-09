package edu.java.configuration.databaseAccessConfigurations.jooq;

import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.interfaces.GitHubRepositoryDataAccessObject;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.interfaces.StackOverflowQuestionDataAccessObject;
import edu.java.data.dao.jooq.dao.ChatJooqDAO;
import edu.java.data.dao.jooq.dao.GitHubRepositoryJooqDAO;
import edu.java.data.dao.jooq.dao.LinkJooqDAO;
import edu.java.data.dao.jooq.dao.StackOverflowQuestionJooqDAO;
import edu.java.data.dao.jooq.repositories.ChatJooqRepository;
import edu.java.data.dao.jooq.repositories.GitHubRepositoryJooqRepository;
import edu.java.data.dao.jooq.repositories.LinkChatJooqRepository;
import edu.java.data.dao.jooq.repositories.LinkJooqRepository;
import edu.java.data.dao.jooq.repositories.StackOverflowQuestionJooqRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "database-access-type", havingValue = "jooq")
public class JooqAccessConfiguration {

    @Bean
    public ChatJooqRepository chatJooqRepository(DefaultDSLContext dsl) {
        return new ChatJooqRepository(dsl);
    }

    @Bean
    public LinkChatJooqRepository linkChatJooqRepository(DefaultDSLContext dsl) {
        return new LinkChatJooqRepository(dsl);
    }

    @Bean
    public GitHubRepositoryJooqRepository gitHubRepositoryJooqRepository(DefaultDSLContext dsl) {
        return new GitHubRepositoryJooqRepository(dsl);
    }

    @Bean
    public LinkJooqRepository linkJooqRepository(DefaultDSLContext dsl) {
        return new LinkJooqRepository(dsl);
    }

    @Bean
    public StackOverflowQuestionJooqRepository stackOverflowQuestionJooqRepository(DefaultDSLContext dsl) {
        return new StackOverflowQuestionJooqRepository(dsl);
    }

    @Bean
    public ChatDataAccessObject chatJooqDAO(
        ChatJooqRepository chatRepository,
        LinkChatJooqRepository linkChatJooqRepository,
        LinkJooqDAO linkDao
    ) {
        return new ChatJooqDAO(chatRepository, linkChatJooqRepository, linkDao);
    }

    @Bean
    public GitHubRepositoryDataAccessObject gitHubRepositoryJooqDAO(
        GitHubRepositoryJooqRepository gitHubRepositoryJooqRepository
    ) {
        return new GitHubRepositoryJooqDAO(gitHubRepositoryJooqRepository);
    }

    @Bean
    public LinkDataAccessObject linkJooqDAO(
        LinkJooqRepository linkRepository,
        LinkChatJooqRepository linkChatJooqRepository,
        UniversalInitialStateScreener universalInitialStateScreener
    ) {
        return new LinkJooqDAO(linkRepository, linkChatJooqRepository, universalInitialStateScreener);
    }

    @Bean
    public StackOverflowQuestionDataAccessObject stackOverflowQuestionJooqDAO(
        StackOverflowQuestionJooqRepository questionRepository
    ) {
        return new StackOverflowQuestionJooqDAO(questionRepository);
    }
}
