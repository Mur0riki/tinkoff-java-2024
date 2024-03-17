package edu.java.bot.service;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.commands.Command;
import edu.java.bot.repository.UserService;
import edu.java.bot.users.User;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public static final String DO_REGISTRATION_MESSAGE = "Необходимо зарегистрироваться.";
    public static final String INVALID_COMMAND_MESSAGE = "Команда введена некорректно.";
    private final Map<String, Command> commandMap;
    private final UserService userRepository;
    private final TrackingUntrackingService trackingUntrackingService;

    public MessageService(
        Map<String, Command> commandMap,
        UserService userRepository,
        TrackingUntrackingService trackingUntrackingService
    ) {
        this.commandMap = commandMap;
        this.userRepository = userRepository;
        this.trackingUntrackingService = trackingUntrackingService;
    }

    public String prepareResponseMessage(Update update) {
        long chatId = update.message().chat().id();
        String textMessage = update.message().text();
        Command botCommand = commandMap.get(textMessage);
        return (botCommand != null) ? botCommand.handle(chatId) : processNonCommandMessage(chatId, textMessage);
    }

    private String processNonCommandMessage(Long chatId, String text) {
        return userRepository.findUserById(chatId).map(u -> {
            try {
                return processStateUserMessage(u, new URI(text));
            } catch (URISyntaxException e) {
                return INVALID_COMMAND_MESSAGE;
            }
        }).orElse(DO_REGISTRATION_MESSAGE);
    }

    private String processStateUserMessage(User user, URI uri) {
        if (user.isWaitingForTracking()) {
            return trackingUntrackingService.prepareWaitTrackingMessage(user, uri);
        }

        if (user.isWaitingForUntracking()) {
            return trackingUntrackingService.prepareWaitUnTrackingMessage(user, uri);
        }
        return INVALID_COMMAND_MESSAGE;
    }

}
