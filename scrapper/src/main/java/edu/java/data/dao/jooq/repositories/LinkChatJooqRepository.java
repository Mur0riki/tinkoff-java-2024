package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.ChatLink;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import static edu.java.scrapper.domain.jooq.tables.LinkChat.LINK_CHAT;

@RequiredArgsConstructor
public class LinkChatJooqRepository {

    private final DefaultDSLContext dsl;

    public void save(ChatLink chatLink) {
        dsl.insertInto(LINK_CHAT)
            .set(LINK_CHAT.CHAT_ID, chatLink.getChatId())
            .set(LINK_CHAT.LINK_ID, chatLink.getLinkId())
            .set(LINK_CHAT.CREATED_AT, chatLink.getCreatedAt())
            .execute();

    }

    public List<ChatLink> findByChatId(long chatId) {
        return dsl.select()
            .from(LINK_CHAT)
            .where(LINK_CHAT.CHAT_ID.eq(chatId))
            .fetchInto(ChatLink.class);
    }

    public List<ChatLink> findByLinkId(long linkId) {
        return dsl.select()
            .from(LINK_CHAT)
            .where(LINK_CHAT.LINK_ID.eq(linkId))
            .fetchInto(ChatLink.class);
    }

    public boolean removeByChatIdAndLinkId(long chatId, long linkId) {
        return dsl.delete(LINK_CHAT)
            .where(LINK_CHAT.CHAT_ID.eq(chatId))
            .and(LINK_CHAT.LINK_ID.eq(linkId))
            .execute() != 0;
    }
}
