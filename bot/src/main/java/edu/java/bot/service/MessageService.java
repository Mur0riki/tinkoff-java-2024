package edu.java.bot.service;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.commands.Command;
import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.url_processor.UrlProcessor;
import edu.java.bot.users.User;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public static final String DO_REGISTRATION_MESSAGE = "Необходимо зарегистрироваться.";
    public static final String INVALID_URI_MESSAGE = "Неверно указан URI.";
    public static final String INVALID_COMMAND_MESSAGE = "Команда введена некорректно.";
    public static final String SUCCESS_TRACK_SITE_MESSAGE = "Сайт успешно добавлен в отслеживаемые.";
    public static final String DUPLICATE_TRACKING_MESSAGE = "Этот сайт уже отслеживается.";
    public static final String INVALID_FOR_TRACK_SITE_MESSAGE = "Отслеживание ресурса с этого сайта не поддерживается.";
    public static final String SUCCESS_UNTRACKED_SITE_MESSAGE = "Ресурс более не отслеживается.";
    public static final String DUPLICATE_UNTRACKING_MESSAGE = "Вы не отслеживали данный ресурс.";
    private final Map<String, Command> commandMap;
    private final UserService userRepository;
    private final UrlProcessor urlProcessor;

    public MessageService(
        Map<String, Command> commandMap,
        UserService userRepository,
        UrlProcessor urlProcessor
    ) {
        this.commandMap = commandMap;
        this.userRepository = userRepository;
        this.urlProcessor = urlProcessor;
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
                return processStateUserMessage(userRepository.findUserById(chatId).get(), new URI(text));
            } catch (URISyntaxException e) {
                return INVALID_COMMAND_MESSAGE;
            }
        }).orElse(DO_REGISTRATION_MESSAGE);
    }

    private String processStateUserMessage(User user, URI uri) {
        if (user.isWaitingForTracking()) {
            return prepareWaitTrackingMessage(user, uri);
        }

        if (user.isWaitingForUntracking()) {
            return prepareWaitUnTrackingMessage(user, uri);
        }
        return INVALID_COMMAND_MESSAGE;
    }

    private String prepareWaitTrackingMessage(User user, URI url) {
        if (urlProcessor.isValidUrl(url)) {
            return (updateUserTrackingSites(user, url)) ? SUCCESS_TRACK_SITE_MESSAGE
                : DUPLICATE_TRACKING_MESSAGE;
        }
        return INVALID_FOR_TRACK_SITE_MESSAGE;
    }

    private String prepareWaitUnTrackingMessage(User user, URI url) {
        if (urlProcessor.isValidUrl(url)) {
            return (deleteTrackingSites(user, url)) ? SUCCESS_UNTRACKED_SITE_MESSAGE
                : DUPLICATE_UNTRACKING_MESSAGE;

        }
        return INVALID_FOR_TRACK_SITE_MESSAGE;
    }

    private boolean updateUserTrackingSites(User user, URI uri) {
        List<URI> trackSites = new ArrayList<>(user.getSites());
        if (trackSites.contains(uri)) {
            return false;
        }

        trackSites.add(uri);
        updateTrackSitesAndCommit(user, trackSites);
        return true;
    }

    private boolean deleteTrackingSites(User user, URI uri) {
        List<URI> trackSites = new ArrayList<>(user.getSites());
        if (!trackSites.contains(uri)) {
            return false;
        }

        trackSites.remove(uri);
        updateTrackSitesAndCommit(user, trackSites);
        return true;
    }

    private void updateTrackSitesAndCommit(User user, List<URI> trackSites) {
        user.setSites(trackSites);
        user.setState(SessionState.BASE_STATE);
        userRepository.saveUser(user);
    }

}
