package edu.java.data.dao;

import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.entities.Link;
import java.util.Optional;
import java.util.Set;

public interface ChatDataAccessObject {

    Optional<Chat> findById(long id);

    Set<Link> getTrackedLinksByChatId(long chatApiId);

    Link associateUrlByChatId(String url, long chatApiId);

    Link dissociateUrlByChatId(String url, long chatApiId);

    Chat registerChatWithId(long apiId);

    void deleteChatWithId(long apiId);
}
