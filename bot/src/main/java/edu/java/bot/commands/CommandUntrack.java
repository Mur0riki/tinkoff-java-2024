package edu.java.bot.commands;

import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("/untrack")
public class CommandUntrack implements Command {
    public static final String UNTRACK_MESSAGE = "Укажите ссылку на ресурс, который более не желаете отслеживать.";
    public static final String UNKNOWN_USER = "Необходимо зарегистрироваться чтобы удалять отслеживаемые ссылки";
    private final UserService userService;

    public CommandUntrack(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String command() {
        return "/untrack";
    }

    @Override
    public String description() {
        return "Позволяет вам прекратить отлеживать один из сайтов которые вы ранее хотели отслеживать.";
    }

    @Transactional
    @Override
    public String handle(long chatId) {
        return prepareUnTrackMessage(chatId);
    }

    private String prepareUnTrackMessage(long chatId) {
        return userService.findUserById(chatId).map(
            user -> {
                userService.findUserById(chatId).ifPresent(this::changeStatusUserAndSave);
                return UNTRACK_MESSAGE;
            }
        ).orElse(UNKNOWN_USER);
    }

    private void changeStatusUserAndSave(User user) {
        user.setState(SessionState.WAIT_URI_FOR_UNTRACKING);
        userService.saveUser(user);
    }
}
