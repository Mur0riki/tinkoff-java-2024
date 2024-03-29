package edu.java.data.dao.jdbc.repositories.rowMapper;

import edu.java.data.dto.Chat;
import java.util.Optional;

public interface ChatRepository {
    void save(Chat chat);

    Optional<Chat> findById(long id);

    boolean removeById(long id);
}
