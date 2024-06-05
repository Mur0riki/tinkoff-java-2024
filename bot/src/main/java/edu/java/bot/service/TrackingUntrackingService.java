package edu.java.bot.service;

import edu.java.bot.scrapper.dto.request.AddLinkRequest;
import edu.java.bot.scrapper.dto.request.RemoveLinkRequest;
import edu.java.bot.scrapper.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.url_processor.UrlProcessor;
import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TrackingUntrackingService {
    public static final String SUCCESS_TRACK_SITE_MESSAGE = "Сайт успешно добавлен в отслеживаемые.";
    public static final String INVALID_FOR_TRACK_SITE_MESSAGE = "Отслеживание ресурса с этого сайта не поддерживается.";
    public static final String SUCCESS_UNTRACKED_SITE_MESSAGE = "Ресурс более не отслеживается.";
    public static final String DUPLICATE_UNTRACKING_MESSAGE = "Вы не отслеживали данный ресурс.";
    public static final String NO_LINK_IN_MESSAGE = "Пожалуйста введите ссылку сразу после команды через пробел";
    private final UrlProcessor urlProcessor;
    @Autowired
    private ScrapperLinksClient scrapperLinksClient;

    public TrackingUntrackingService(UrlProcessor urlProcessor) {
        this.urlProcessor = urlProcessor;
    }

    @Transactional
    public String executeTrackCommand(long chatId, String[] textMessage) {
        if (textMessage.length > 1) {
            try {
                if (urlProcessor.isValidUrl(new URI(textMessage[1]))) {
                    try {
                        scrapperLinksClient.trackLink(chatId, new AddLinkRequest(textMessage[1]));
                    } catch (RuntimeException e) {
                        return INVALID_FOR_TRACK_SITE_MESSAGE;
                    }
                    return SUCCESS_TRACK_SITE_MESSAGE;
                } else {
                    return INVALID_FOR_TRACK_SITE_MESSAGE;
                }
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        } else {
            return NO_LINK_IN_MESSAGE;
        }
    }

    @Transactional
    public String executreUntrackCommand(long chatId, String[] textMessage) {
        if (textMessage.length > 1) {
            try {
                if (urlProcessor.isValidUrl(new URI(textMessage[1]))) {
                    try {
                        scrapperLinksClient.untrackLink(chatId, new RemoveLinkRequest(textMessage[1]));
                    } catch (RuntimeException e) {
                        return DUPLICATE_UNTRACKING_MESSAGE;
                    }
                    return SUCCESS_UNTRACKED_SITE_MESSAGE;
                } else {
                    return INVALID_FOR_TRACK_SITE_MESSAGE;
                }
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        } else {
            return NO_LINK_IN_MESSAGE;
        }
    }
}
