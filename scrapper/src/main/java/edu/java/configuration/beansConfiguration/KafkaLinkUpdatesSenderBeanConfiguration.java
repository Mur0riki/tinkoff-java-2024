package edu.java.configuration.beansConfiguration;


import edu.java.WebClients.dto.telegrambot.request.LinkUpdate;
import edu.java.kafka.LinkUpdatesQueueProducer;
import edu.java.linkUpdateScheduler.linkUpdateSender.KafkaLinkUpdatesSender;
import edu.java.linkUpdateScheduler.linkUpdateSender.LinkUpdatesSender;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration
@ConditionalOnProperty(prefix = "app", name = "useQueue", havingValue = "true")
@RequiredArgsConstructor
public class KafkaLinkUpdatesSenderBeanConfiguration {

    private final KafkaTemplate<String, LinkUpdate> kafkaTemplate;

    @Bean
    public LinkUpdatesSender linkUpdatesSender() {
        return new KafkaLinkUpdatesSender(producer());
    }

    @Bean
    public LinkUpdatesQueueProducer producer() {
        return new LinkUpdatesQueueProducer(kafkaTemplate);
    }
}
