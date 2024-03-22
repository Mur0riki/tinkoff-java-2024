package edu.java.bot.commands;

import edu.java.bot.repository.UserService;
import edu.java.bot.service.CommandService;
import org.springframework.stereotype.Component;

@Component("/untrack")
public class CommandUntrack implements Command {
    private final UserService userService;
    private final CommandService commandService;

    public CommandUntrack(UserService userService, CommandService commandService) {
        this.userService = userService;
        this.commandService = commandService;
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
    public String handle(long chatId) {
        return commandService.prepareUntrackingMessage(chatId);
    }
}
