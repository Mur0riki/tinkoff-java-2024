package edu.java.linkUpdateScheduler.linkUpdatesCheckers.allUpdatesCheckers;

import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.data.postgres.entities.Link;
import edu.java.linkUpdateScheduler.exceptions.IncorrectHostException;
import java.util.List;

public interface LinkAllUpdatesChecker {
    List<LinkUpdate> getUpdates(Link link) throws IncorrectHostException;
}
