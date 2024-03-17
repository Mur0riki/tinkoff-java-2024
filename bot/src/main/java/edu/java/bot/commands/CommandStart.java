package edu.java.bot.commands;

import edu.java.bot.service.CommandService;
import org.springframework.stereotype.Component;

@Component("/start")
public class CommandStart implements Command {

    public static final String SUCCESS_REGISTRATION_MESSAGE = "Регистрация прошла успешно!";
    private final CommandService commandService;

    public CommandStart(CommandService commandService) {
        this.commandService = commandService;
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
        return commandService.registerUser(chatId);
    }
}
