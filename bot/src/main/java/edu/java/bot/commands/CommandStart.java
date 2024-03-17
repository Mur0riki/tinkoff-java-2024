package edu.java.bot.commands;

import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Component("/start")
public class CommandStart implements Command {

    @Autowired
    private TransactionTemplate template;
    public static final String SUCCESS_REGISTRATION_MESSAGE = "Регистрация прошла успешно!";
    private static final String ALREADY_REGISTRATION_MESSAGE = "Вы уже зарегистрированы в боте!";
    private final UserService userService;

    public CommandStart(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String command() {
        return "/start";
    }

    @Override
    public String description() {
        return "Позволяет зарегистрироваться в нашей системе.";
    }

    @Override
    public String handle(long chatId) {
        return registerUser(chatId);
    }

    @Transactional
    private String registerUser(long chatId) {
        return userService.findUserById(chatId).map(u -> ALREADY_REGISTRATION_MESSAGE)
            .orElseGet(() -> {
                userService.saveUser(new User(chatId, List.of(), SessionState.BASE_STATE));
                return SUCCESS_REGISTRATION_MESSAGE;
            });
    }
}
