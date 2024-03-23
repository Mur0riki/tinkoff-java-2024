package edu.java.data.postgres.repositories;

import edu.java.data.postgres.entities.Chat;
import java.util.Optional;

public interface ChatRepository {
    void save(Chat chat);

    Optional<Chat> findById(long id);

    boolean removeById(long id);
}
