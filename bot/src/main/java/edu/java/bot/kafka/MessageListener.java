package edu.java.bot.kafka;


import edu.java.bot.restApi.dto.request.LinkUpdate;
import edu.java.bot.restApi.service.LinkUpdateService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.DltStrategy;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class MessageListener {

    private static final Logger LOGGER = LogManager.getLogger();

    private final LinkUpdateService linkUpdateService;
    @RetryableTopic(attempts = "1",
                    kafkaTemplate = "retryableTopicKafkaTemplate",
                    dltStrategy = DltStrategy.FAIL_ON_ERROR)
    @KafkaListener(topics = "linkUpdates", groupId = "mainGroup")
    public void listenToLinkUpdates(@Payload LinkUpdate update) {
        LOGGER.debug("Got new update:" + update);
        linkUpdateService.handleLinkUpdate(update);
    }

    @DltHandler
    public void handleDlt(LinkUpdate update) {
        LOGGER.warn("Can't process link update: {}", update);
    }

}
