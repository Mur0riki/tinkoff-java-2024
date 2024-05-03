package edu.java.data.dao.jooq.repositories;

import edu.java.data.dto.Chat;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.jooq.impl.DefaultDSLContext;
import static edu.java.scrapper.domain.jooq.tables.Chat.CHAT;

@RequiredArgsConstructor
public class ChatJooqRepository {

    private final DefaultDSLContext dsl;

    public void save(Chat chat) {
        dsl.insertInto(CHAT)
            .set(CHAT.ID, chat.getId())
            .set(CHAT.CREATED_AT, chat.getCreatedAt())
            .execute();
    }

    public Optional<Chat> findById(long id) {
        Chat chat = dsl.select()
            .from(CHAT)
            .where(CHAT.ID.eq(id))
            .fetchOneInto(Chat.class);
        return Optional.ofNullable(chat);
    }

    public boolean removeById(long id) {
        return dsl.delete(CHAT)
            .where(CHAT.ID.eq(id))
            .execute() != 0;
    }

}

