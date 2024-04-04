package edu.java.bot.commands;

import edu.java.bot.scrapper.dto.response.LinkResponse;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperLinksClient;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("/list")
public class CommandList implements Command {
    public static final String EMPTY_SITES_LIST = "Вы не отслеживаете ни одну ссылку";
    public static final String USER_TRACK_SITES_MESSAGE = "Вы отслеживаете %d сайтов\n";
    public static final String LIST_TRACK_SEPARATOR = "\n";

    @Override public String command() {
        return "/list";
    }

    @Override public String description() {
        return "Позволяет вам увидеть список сайтов которые вы решили отслеживать.";
    }

    @Autowired
    private ScrapperLinksClient scrapperLinksClient;

    @Override
    public String handle(long chatId, String[] textMessage) {
        return scrapperLinksClient.findTrackedLinks(chatId).getBody().links().isEmpty()
            ? EMPTY_SITES_LIST :
            prepareListSitesMessage(scrapperLinksClient.findTrackedLinks(chatId).getBody().links());
    }

    public String prepareListSitesMessage(List<LinkResponse> uriList) {

        StringBuilder sitesString = new StringBuilder(USER_TRACK_SITES_MESSAGE.formatted(uriList.size()));
        Stream<LinkResponse> uriStream = uriList.stream();
        String result = uriStream
            .map(LinkResponse::url)
            .map(URI::toString)
            .collect(Collectors.joining(LIST_TRACK_SEPARATOR));
        sitesString.append(result);
        return sitesString.toString();
    }
}
