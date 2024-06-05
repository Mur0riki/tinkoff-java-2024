package edu.java.restApi.service;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dto.Chat;
import edu.java.data.exceptions.DoubleChatRegistrationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TelegramChatService {

    private final ChatDataAccessObject chatDao;

    public Chat registerChat(long apiId) throws DoubleChatRegistrationException {
        return chatDao.registerChatWithId(apiId);
    }

    public void deleteChat(long apiId) {
        chatDao.deleteChatWithId(apiId);
    }
}
