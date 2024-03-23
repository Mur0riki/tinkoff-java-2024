package edu.java.bot.service;

import edu.java.bot.scrapper.exceptions.DoubleChatRegistrationException;
import edu.java.bot.scrapper.webClients.ScrapperTelegramChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommandService {
    public static final String SUCCESS_REGISTRATION_MESSAGE = "Регистрация прошла успешно!";
    private static final String ALREADY_REGISTRATION_MESSAGE = "Вы уже зарегистрированы в боте!";
    public static final String UNKNOWN_USER_TRACK = "Необходимо зарегистрироваться перед тем как отслеживать ссылки.";
    public static final String TRACK_MESSAGE = "Укажите ссылку на интересуюший вас ресурс.";
    public static final String UNTRACK_MESSAGE = "Укажите ссылку на ресурс, который более не желаете отслеживать.";
    public static final String UNKNOWN_USER_UNTRACK =
        "Необходимо зарегистрироваться чтобы удалять отслеживаемые ссылки";
    @Autowired
    private ScrapperTelegramChatClient scrapperTelegramChatClient;

    @Transactional
    public String registerUser(long chatId) {
        try {
            scrapperTelegramChatClient.registerNewChat(chatId);
        } catch (DoubleChatRegistrationException e) {
            return ALREADY_REGISTRATION_MESSAGE;
        }
        return SUCCESS_REGISTRATION_MESSAGE;

    }
}
