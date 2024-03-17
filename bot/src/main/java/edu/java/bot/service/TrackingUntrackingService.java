package edu.java.bot.service;

import edu.java.bot.model.SessionState;
import edu.java.bot.repository.UserService;
import edu.java.bot.url_processor.UrlProcessor;
import edu.java.bot.users.User;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TrackingUntrackingService {
    public static final String SUCCESS_TRACK_SITE_MESSAGE = "Сайт успешно добавлен в отслеживаемые.";
    public static final String DUPLICATE_TRACKING_MESSAGE = "Этот сайт уже отслеживается.";
    public static final String INVALID_FOR_TRACK_SITE_MESSAGE = "Отслеживание ресурса с этого сайта не поддерживается.";
    public static final String SUCCESS_UNTRACKED_SITE_MESSAGE = "Ресурс более не отслеживается.";
    public static final String DUPLICATE_UNTRACKING_MESSAGE = "Вы не отслеживали данный ресурс.";
    private final UrlProcessor urlProcessor;

    private final UserService userService;

    public TrackingUntrackingService(UrlProcessor urlProcessor, UserService userService) {
        this.urlProcessor = urlProcessor;
        this.userService = userService;
    }

    @Transactional
    public String prepareWaitTrackingMessage(User user, URI url) {
        if (urlProcessor.isValidUrl(url)) {
            return (updateUserTrackingSites(user, url)) ? SUCCESS_TRACK_SITE_MESSAGE
                : DUPLICATE_TRACKING_MESSAGE;
        }
        return INVALID_FOR_TRACK_SITE_MESSAGE;
    }

    @Transactional
    public String prepareWaitUnTrackingMessage(User user, URI url) {
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
        userService.saveUser(user);
    }
}
