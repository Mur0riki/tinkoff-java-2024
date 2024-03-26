package edu.java.bot.service;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.commands.Command;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public static final String DO_REGISTRATION_MESSAGE = "Необходимо зарегистрироваться.";
    public static final String INVALID_COMMAND_MESSAGE = "Команда введена некорректно.";
    private final Map<String, Command> commandMap;
    private final TrackingUntrackingService trackingUntrackingService;

    public MessageService(
        Map<String, Command> commandMap,
        TrackingUntrackingService trackingUntrackingService
    ) {
        this.commandMap = commandMap;
        this.trackingUntrackingService = trackingUntrackingService;
    }

    public String prepareResponseMessage(Update update) {
        long chatId = update.message().chat().id();
        String textMessage = update.message().text();
        String[] textmsg = update.message().text().split(" ");
        Command botCommand = commandMap.get(textmsg[0]);
        return (botCommand != null) ? botCommand.handle(chatId, textmsg) : INVALID_COMMAND_MESSAGE;
    }

}
