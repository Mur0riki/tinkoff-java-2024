package edu.java.linkUpdateScheduler.linkUpdatesCheckers;

import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dto.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import edu.java.linkUpdateScheduler.linkUpdatesCheckers.allUpdatesCheckers.LinkAllUpdatesChecker;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Component
@RequiredArgsConstructor
public class UniversalLinkUpdatesChecker {

    private static final Logger LOGGER = LogManager.getLogger();

    private final List<LinkAllUpdatesChecker> linkAllUpdatesCheckers;
    private final LinkDataAccessObject linkDao;

    public List<LinkUpdate> getUpdates(Link link) {
        for (var linkUpdateChecker : linkAllUpdatesCheckers) {
            try {
                return linkUpdateChecker.getUpdates(link);
            } catch (IncorrectHostException ex) {

            } catch (WebClientResponseException ex) {
                LOGGER.warn(ex.getMessage() + ex.getStatusCode());
            }
        }
        linkDao.updateLastCheckedAtById(LocalDateTime.now(), link.getId());
        return List.of();
    }
}
