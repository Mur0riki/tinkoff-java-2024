package edu.java.bot.commands;

import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("/track")
public class CommandTrack implements Command {
    public static final String UNKNOWN_USER = "Необходимо зарегистрироваться перед тем как отслеживать ссылки.";
    public static final String TRACK_MESSAGE = "Укажите ссылку на интересуюший вас ресурс.";
    private final UserService userService;

    public CommandTrack(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String command() {
        return "/track";
    }

    @Override
    public String description() {
        return "Позволяет начать отслеживать в нашем боте нужный вам сайт.";
    }

    @Transactional
    @Override
    public String handle(long chatId) {
        return prepareTrackMessage(chatId);
    }

    private String prepareTrackMessage(Long chatId) {
        return userService.findUserById(chatId).map(
            user -> {
                changeStatusUserAndSave(userService.findUserById(chatId).get());
                return TRACK_MESSAGE;
            }
        ).orElse(UNKNOWN_USER);
    }

    private void changeStatusUserAndSave(User user) {
        user.setState(SessionState.WAIT_URI_FOR_TRACKING);
        userService.saveUser(user);
    }
}
