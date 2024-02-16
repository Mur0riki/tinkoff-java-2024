package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("/help")
@Qualifier("action_command")
public class CommandHelp implements Command {
    public static final String STRING_COMMANDS_BOT = "Команды бота:\n";
    public static final String STRING_COMMANDS_ENUMERATION = "%s - %s\n";
    private final List<Command> listCommand;

    public CommandHelp(@Qualifier("action_command") List<Command> listCommand) {
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
    public String handle(Update update) {
        return prepareHelpCommandDescription();
    }

    private String prepareHelpCommandDescription() {
        var commandListString = new StringBuilder();
        commandListString.append(STRING_COMMANDS_BOT);
        listCommand.stream()
            .map(command -> STRING_COMMANDS_ENUMERATION.formatted(command.command(), command.description()))
            .forEach(commandListString::append);
        commandListString.append(STRING_COMMANDS_ENUMERATION.formatted(this.command(), this.description()));
        return new String(commandListString);
    }
}
