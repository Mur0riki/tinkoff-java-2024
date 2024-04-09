package edu.java.linkUpdateScheduler.linkUpdateSender;

import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import java.util.Set;


public interface LinkUpdatesSender {

    void sendUpdate(LinkUpdate update);

    void sendUpdates(Set<LinkUpdate> updates);

}
