package edu.java.restApi.service;

import edu.java.data.dao.ChatDataAccessObject;
import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.postgres.entities.Link;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final ChatDataAccessObject chatDao;

    public Set<Link> getTrackedLinks(long chatApiId) {
        return chatDao.getTrackedLinksByChatId(chatApiId);
    }

    public Link addLinkToTrack(long chatApiId, String linkUrl) {
        return chatDao.associateUrlByChatId(linkUrl, chatApiId);
    }

    public Link untrackLink(long chatApiId, String linkUrl) {
        return chatDao.dissociateUrlByChatId(linkUrl, chatApiId);
    }
}
