package edu.java.bot.configuration.kafkaConfiguration;

import edu.java.bot.configuration.ApplicationConfig;
import jakarta.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
@RequiredArgsConstructor
public class KafkaTopicBeansConfiguration {

    private static final int PARTITIONS_DEFAULT = 1;
    private static final int REPLICAS_DEFAULT = 1;

    private final ApplicationConfig applicationConfig;

    private Set<ApplicationConfig.KafkaTopicConfiguration> topicConfigurations;

    @PostConstruct
    private void init() {
        topicConfigurations = applicationConfig.kafkaTopicConfigurations();
    }

    @Bean
    public KafkaAdmin.NewTopics kafkaTopics() {
        return new KafkaAdmin.NewTopics(
            buildNewTopics()
        );
    }

    private NewTopic[] buildNewTopics() {
        Set<NewTopic> result = new HashSet<>();

        for (var config : topicConfigurations) {
            var newTopic = buildNewTopic(config);
            result.add(newTopic);
        }

        return result.toArray(new NewTopic[0]);
    }

    private NewTopic buildNewTopic(ApplicationConfig.KafkaTopicConfiguration configuration) {
        return TopicBuilder.name(configuration.name())
            .partitions(getDefaultPartitionsIfNull(configuration.partitions()))
            .replicas(getDefaultReplicasIfNull(configuration.replicas()))
            .build();
    }

    private int getDefaultPartitionsIfNull(Integer partitions) {
        return Objects.requireNonNullElse(partitions, PARTITIONS_DEFAULT);
    }

    private int getDefaultReplicasIfNull(Integer replicas) {
        return Objects.requireNonNullElse(replicas, REPLICAS_DEFAULT);
    }
}
