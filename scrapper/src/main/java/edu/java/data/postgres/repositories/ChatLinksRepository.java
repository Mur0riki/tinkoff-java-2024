package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.ChatLink;
import java.util.List;

public interface ChatLinksRepository {
    void save(ChatLink chatLink);

    List<ChatLink> findByChatId(long chatId);

    List<ChatLink> findByLinkId(long linkId);

    boolean removeByChatIdAndLinkId(long chatId, long linkId);
}

