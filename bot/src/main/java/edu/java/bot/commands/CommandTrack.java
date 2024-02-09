package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;

public class CommandTrack implements Command {
    public static final String UNKNOWN_USER = "Необходимо зарегистрироваться перед тем как отслеживать ссылки.";
    public static final String TRACK_MESSAGE = "Укажите ссылку на интересуюший вас ресурс.";
    private final UserService userServise;

    public CommandTrack(UserService userService) {
        this.userServise = userService;
    }

    @Override
    public String command() {
        return "/track";
    }

    @Override
    public String description() {
        return "Позволяет начать отслеживать в нашем боте нужный вам сайт.";
    }

    @Override
    public String handle(Update update) {
        var chatId = update.message().chat().id();

        return prepareTrackMessage(chatId);
    }

    private String prepareTrackMessage(Long chatId) {
        var userOptional = userServise.findUserById(chatId);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            changeStatusUserAndSave(user);

            return TRACK_MESSAGE;
        }
        return UNKNOWN_USER;
    }

    private void changeStatusUserAndSave(User user) {
        user.setState(SessionState.WAIT_URI_FOR_TRACKING);
        userServise.saveUser(user);
    }
}
