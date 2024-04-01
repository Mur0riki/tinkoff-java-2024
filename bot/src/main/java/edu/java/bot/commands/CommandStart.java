package edu.java.bot.commands;

import edu.java.bot.service.CommandService;
import org.springframework.stereotype.Component;

@Component("/start")
public class CommandStart implements Command {
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
    public String handle(long chatId, String[] textMessage) {
        return commandService.registerUser(chatId);
    }
}
