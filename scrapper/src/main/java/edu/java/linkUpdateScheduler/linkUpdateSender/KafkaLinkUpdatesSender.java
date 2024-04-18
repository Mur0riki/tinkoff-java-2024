package edu.java.linkUpdateScheduler.linkUpdateSender;

import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.kafka.LinkUpdatesQueueProducer;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class KafkaLinkUpdatesSender implements LinkUpdatesSender {

    private final LinkUpdatesQueueProducer producer;

    @Override
    public void sendUpdate(LinkUpdate linkUpdate) {
        producer.send(linkUpdate);
    }

    @Override
    public void sendUpdates(Set<LinkUpdate> updates) {
        updates.forEach(this::sendUpdate);
    }
}
