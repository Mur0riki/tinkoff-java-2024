/*
 * This file is generated by jOOQ.
 */
package edu.java.domain.jooq.public_;


import edu.java.domain.jooq.public_.tables.Chat;
import edu.java.domain.jooq.public_.tables.GitHubRepositories;
import edu.java.domain.jooq.public_.tables.Link;
import edu.java.domain.jooq.public_.tables.LinkChat;
import edu.java.domain.jooq.public_.tables.StackOverflowQuestions;

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in public.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables {

    /**
     * The table <code>public.chat</code>.
     */
    public static final Chat CHAT = Chat.CHAT;

    /**
     * The table <code>public.git_hub_repositories</code>.
     */
    public static final GitHubRepositories GIT_HUB_REPOSITORIES = GitHubRepositories.GIT_HUB_REPOSITORIES;

    /**
     * The table <code>public.link</code>.
     */
    public static final Link LINK = Link.LINK;

    /**
     * The table <code>public.link_chat</code>.
     */
    public static final LinkChat LINK_CHAT = LinkChat.LINK_CHAT;

    /**
     * The table <code>public.stack_overflow_questions</code>.
     */
    public static final StackOverflowQuestions STACK_OVERFLOW_QUESTIONS = StackOverflowQuestions.STACK_OVERFLOW_QUESTIONS;
}
