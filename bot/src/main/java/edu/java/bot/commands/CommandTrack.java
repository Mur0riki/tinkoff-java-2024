package edu.java.bot.commands;

import edu.java.bot.service.CommandService;
import org.springframework.stereotype.Component;

@Component("/track")
public class CommandTrack implements Command {
    private final CommandService commandService;

    public CommandTrack(CommandService commandService) {
        this.commandService = commandService;
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
    public String handle(long chatId) {
        return commandService.prepareTrackMessage(chatId);
    }
}
