/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_;


import edu.java.domain.jooq.public_.tables.Chat;
import edu.java.domain.jooq.public_.tables.GitHubRepositories;
import edu.java.domain.jooq.public_.tables.Link;
import edu.java.domain.jooq.public_.tables.LinkChat;
import edu.java.domain.jooq.public_.tables.StackOverflowQuestions;
import edu.java.domain.jooq.public_.tables.records.ChatRecord;
import edu.java.domain.jooq.public_.tables.records.GitHubRepositoriesRecord;
import edu.java.domain.jooq.public_.tables.records.LinkChatRecord;
import edu.java.domain.jooq.public_.tables.records.LinkRecord;
import edu.java.domain.jooq.public_.tables.records.StackOverflowQuestionsRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ChatRecord> CHAT_PKEY = Internal.createUniqueKey(Chat.CHAT, DSL.name("chat_pkey"), new TableField[] { Chat.CHAT.ID }, true);
    public static final UniqueKey<GitHubRepositoriesRecord> GIT_HUB_REPOSITORIES_PKEY = Internal.createUniqueKey(GitHubRepositories.GIT_HUB_REPOSITORIES, DSL.name("git_hub_repositories_pkey"), new TableField[] { GitHubRepositories.GIT_HUB_REPOSITORIES.ID }, true);
    public static final UniqueKey<LinkRecord> LINK_PKEY = Internal.createUniqueKey(Link.LINK, DSL.name("link_pkey"), new TableField[] { Link.LINK.ID }, true);
    public static final UniqueKey<LinkRecord> LINK_URL_KEY = Internal.createUniqueKey(Link.LINK, DSL.name("link_url_key"), new TableField[] { Link.LINK.URL }, true);
    public static final UniqueKey<LinkChatRecord> LINK_CHAT_PKEY = Internal.createUniqueKey(LinkChat.LINK_CHAT, DSL.name("link_chat_pkey"), new TableField[] { LinkChat.LINK_CHAT.CHAT_ID, LinkChat.LINK_CHAT.LINK_ID }, true);
    public static final UniqueKey<StackOverflowQuestionsRecord> STACK_OVERFLOW_QUESTIONS_LINK_ID_KEY = Internal.createUniqueKey(StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS, DSL.name("stack_overflow_questions_link_id_key"), new TableField[] { StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS.LINK_ID }, true);
    public static final UniqueKey<StackOverflowQuestionsRecord> STACK_OVERFLOW_QUESTIONS_PKEY = Internal.createUniqueKey(StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS, DSL.name("stack_overflow_questions_pkey"), new TableField[] { StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<GitHubRepositoriesRecord, LinkRecord> GIT_HUB_REPOSITORIES__GIT_HUB_REPOSITORIES_LINK_ID_FKEY = Internal.createForeignKey(GitHubRepositories.GIT_HUB_REPOSITORIES, DSL.name("git_hub_repositories_link_id_fkey"), new TableField[] { GitHubRepositories.GIT_HUB_REPOSITORIES.LINK_ID }, Keys.LINK_PKEY, new TableField[] { Link.LINK.ID }, true);
    public static final ForeignKey<LinkChatRecord, ChatRecord> LINK_CHAT__LINK_CHAT_CHAT_ID_FKEY = Internal.createForeignKey(LinkChat.LINK_CHAT, DSL.name("link_chat_chat_id_fkey"), new TableField[] { LinkChat.LINK_CHAT.CHAT_ID }, Keys.CHAT_PKEY, new TableField[] { Chat.CHAT.ID }, true);
    public static final ForeignKey<LinkChatRecord, LinkRecord> LINK_CHAT__LINK_CHAT_LINK_ID_FKEY = Internal.createForeignKey(LinkChat.LINK_CHAT, DSL.name("link_chat_link_id_fkey"), new TableField[] { LinkChat.LINK_CHAT.LINK_ID }, Keys.LINK_PKEY, new TableField[] { Link.LINK.ID }, true);
    public static final ForeignKey<StackOverflowQuestionsRecord, LinkRecord> STACK_OVERFLOW_QUESTIONS__STACK_OVERFLOW_QUESTIONS_LINK_ID_FKEY = Internal.createForeignKey(StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS, DSL.name("stack_overflow_questions_link_id_fkey"), new TableField[] { StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS.LINK_ID }, Keys.LINK_PKEY, new TableField[] { Link.LINK.ID }, true);
}
