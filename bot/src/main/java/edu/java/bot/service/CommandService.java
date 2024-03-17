package edu.java.bot.service;

import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CommandService {
    private final UserService userService;
    public static final String SUCCESS_REGISTRATION_MESSAGE = "Регистрация прошла успешно!";
    private static final String ALREADY_REGISTRATION_MESSAGE = "Вы уже зарегистрированы в боте!";
    public static final String UNKNOWN_USER_TRACK = "Необходимо зарегистрироваться перед тем как отслеживать ссылки.";
    public static final String TRACK_MESSAGE = "Укажите ссылку на интересуюший вас ресурс.";
    public static final String UNTRACK_MESSAGE = "Укажите ссылку на ресурс, который более не желаете отслеживать.";
    public static final String UNKNOWN_USER_UNTRACK =
        "Необходимо зарегистрироваться чтобы удалять отслеживаемые ссылки";

    public CommandService(UserService userService) {
        this.userService = userService;
    }

    public String registerUser(long chatId) {
        return userService.findUserById(chatId).map(u -> ALREADY_REGISTRATION_MESSAGE)
            .orElseGet(() -> {
                userService.saveUser(new User(chatId, List.of(), SessionState.BASE_STATE));
                return SUCCESS_REGISTRATION_MESSAGE;
            });
    }

    public String prepareTrackMessage(Long chatId) {
        return userService.findUserById(chatId).map(
            user -> {
                user.setState(SessionState.WAIT_URI_FOR_TRACKING);
                userService.saveUser(user);
                return TRACK_MESSAGE;
            }
        ).orElse(UNKNOWN_USER_TRACK);
    }

    public String prepareUntrackingMessage(long chatId) {
        return userService.findUserById(chatId).map(
            user -> {
                user.setState(SessionState.WAIT_URI_FOR_UNTRACKING);
                userService.saveUser(user);
                return UNTRACK_MESSAGE;
            }
        ).orElse(UNKNOWN_USER_UNTRACK);
    }
}
