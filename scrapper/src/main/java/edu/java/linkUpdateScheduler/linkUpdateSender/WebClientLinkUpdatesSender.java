package edu.java.linkUpdateScheduler.linkUpdateSender;

import edu.java.WebClients.TelegramBotClientInBeanConfiguration;
import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import java.util.List;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class WebClientLinkUpdatesSender implements LinkUpdatesSender {

    private final TelegramBotClientInBeanConfiguration client;

    @Override
    public void sendUpdate(LinkUpdate update) {
        client.sendLinkUpdate(List.of(update));
    }

    @Override
    public void sendUpdates(Set<LinkUpdate> updates) {
        client.sendLinkUpdate(updates.stream().toList());
    }
}
