package edu.java.restApi.service;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.dto.Link;
import java.net.URI;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final ChatDataAccessObject chatDao;

    public Set<Link> getTrackedLinks(long chatApiId) {
        if(chatDao.findById(chatApiId).isPresent()){
            return chatDao.getTrackedLinksByChatId(chatApiId);
        }
        else return Set.of();
    }

    public Link addLinkToTrack(long chatApiId, URI linkUrl) {
        return chatDao.associateUrlByChatId(linkUrl, chatApiId);
    }

    public Link untrackLink(long chatApiId, URI linkUrl) {
        return chatDao.dissociateUrlByChatId(linkUrl, chatApiId);
    }
}
