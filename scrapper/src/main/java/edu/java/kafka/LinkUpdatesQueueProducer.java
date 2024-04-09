package edu.java.kafka;

import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkUpdatesQueueProducer {

    private static final Logger LOGGER = LogManager.getLogger();

    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;

    public void send(LinkUpdate update) {
        LOGGER.warn("Sending message to kafka...");
        kafkaTemplate.send("linkUpdates", update);
    }
}
