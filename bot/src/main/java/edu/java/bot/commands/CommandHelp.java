package edu.java.bot.commands;

import java.util.List;
import org.springframework.stereotype.Component;

@Component("/help")
public class CommandHelp implements Command {
    public static final String STRING_COMMANDS_BOT = "Команды бота:\n";
    public static final String STRING_COMMANDS_ENUMERATION = "%s - %s\n";
    private final List<Command> listCommand;

    public CommandHelp(List<Command> listCommand) {
        this.listCommand = listCommand;
    }

    @Override
    public String command() {
        return "/help";
    }

    @Override
    public String description() {
        return "Позволяет увидеть всё доступные команды бота.";
    }

    @Override
    public String handle(long chatId) {
        return prepareHelpCommandDescription();
    }

    private String prepareHelpCommandDescription() {
        StringBuilder commandListString = new StringBuilder(STRING_COMMANDS_BOT);
        listCommand.stream()
            .map(command -> STRING_COMMANDS_ENUMERATION.formatted(command.command(), command.description()))
            .forEach(commandListString::append);
        commandListString.append(STRING_COMMANDS_ENUMERATION.formatted(this.command(), this.description()));
        return commandListString.toString();
    }
}
