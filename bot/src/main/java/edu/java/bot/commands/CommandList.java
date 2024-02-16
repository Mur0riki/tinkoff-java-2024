package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.repository.UserService;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("/list")
@Qualifier("action_command")
public class CommandList implements Command {
    public static final String EMPTY_SITES_LIST = "Вы не отслеживаете ни одну ссылку";
    public static final String UNKNOWN_USER =
        "Необходимо зарегистрироваться для просмотра списка отслеживаемых ссылок";
    public static final String USER_TRACK_SITES_MESSAGE = "Вы отслеживаете %d сайтов\n";
    public static final String LIST_TRACK_SEPARATOR = "\n";
    private final UserService userService;

    public CommandList(UserService userService) {
        this.userService = userService;
    }

    @Override public String command() {
        return "/list";
    }

    @Override public String description() {
        return "Позволяет вам увидеть список сайтов которые вы решили отслеживать.";
    }

    @Override public String handle(Update update) {
        var chatId = update.message().chat().id();

        var userOptional = userService.findUserById(chatId);
        return userOptional.map(user ->
            user.getSites().isEmpty() ? EMPTY_SITES_LIST
                : prepareListSitesMessage(userOptional.get().getSites())).orElse(UNKNOWN_USER);
    }

    private String prepareListSitesMessage(List<URI> uriList) {
        var sitesString = new StringBuilder().append(USER_TRACK_SITES_MESSAGE.formatted(uriList.size()));
        Stream<URI> uriStream = uriList.stream();
        String result = uriStream
            .map(URI::toString)
            .collect(Collectors.joining(LIST_TRACK_SEPARATOR));
        sitesString.append(result);
        return new String(sitesString);
    }
}
