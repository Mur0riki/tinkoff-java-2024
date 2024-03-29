package edu.java.data.dao.interfaces;

import edu.java.data.dto.ChatLink;
import java.util.List;

public interface ChatLinksRepository {
    void save(ChatLink chatLink);

    List<ChatLink> findByChatId(long chatId);

    List<ChatLink> findByLinkId(long linkId);

    boolean removeByChatIdAndLinkId(long chatId, long linkId);
}

