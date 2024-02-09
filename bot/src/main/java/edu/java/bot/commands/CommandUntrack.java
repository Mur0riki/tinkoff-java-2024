package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;
import java.util.Optional;

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

    @Override
    public String handle(Update update) {
        long chatId = update.message().chat().id();
        return prepareUnTrackMessage(chatId);
    }

    private String prepareUnTrackMessage(Long chatId) {
        Optional<User> userOptional = userService.findUserById(chatId);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            changeStatusUserAndSave(user);
            return UNTRACK_MESSAGE;
        }
        return UNKNOWN_USER;
    }

    private void changeStatusUserAndSave(User user) {
        user.setState(SessionState.WAIT_URI_FOR_UNTRACKING);
        userService.saveUser(user);
    }
}
