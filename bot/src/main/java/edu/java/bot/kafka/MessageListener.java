package edu.java.bot.kafka;


import edu.java.bot.restApi.dto.request.LinkUpdate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.DltStrategy;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    private static final Logger LOGGER = LogManager.getLogger();

    @RetryableTopic(attempts = "1",
                    kafkaTemplate = "retryableTopicKafkaTemplate",
                    dltStrategy = DltStrategy.FAIL_ON_ERROR)
    @KafkaListener(topics = "linkUpdates", groupId = "mainGroup")
    public void listenToLinkUpdates(@Payload LinkUpdate update) {
        LOGGER.debug("Got new update:" + update);
    }

    @DltHandler
    public void handleDlt(LinkUpdate update) {
        LOGGER.warn("Can't process link update: {}", update);
    }

}
