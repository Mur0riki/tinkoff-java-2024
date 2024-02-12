package edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import edu.java.bot.repository.UserService;
import java.net.URI;
import java.util.List;
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

        if (userOptional.isPresent()) {
            var listSites = userOptional.get().getSites();
            if (!listSites.isEmpty()) {
                return prepareListSitesMessage(listSites);
            }
            return EMPTY_SITES_LIST;
        }
        return UNKNOWN_USER;
    }

    private String prepareListSitesMessage(List<URI> uriList) {
        var sitesString = new StringBuilder();

        sitesString.append(USER_TRACK_SITES_MESSAGE.formatted(uriList.size()));
        for (URI uri : uriList) {
            sitesString.append(uri.toString()).append(LIST_TRACK_SEPARATOR);
        }

        return new String(sitesString);
    }
}
