package edu.java.configuration.beansConfiguration.kafka;

import edu.java.configuration.kafka.KafkaConfig;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "app", name = "use-queue",havingValue = "true")
public class KafkaTopicsConfiguration {

    private static final int PARTITIONS_DEFAULT = 1;
    private static final int REPLICAS_DEFAULT = 1;
    private Set<KafkaConfig.KafkaTopicConfiguration> topicConfigurations;
    public KafkaTopicsConfiguration(KafkaConfig config){
        topicConfigurations = config.topicConfigurations();
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

    private NewTopic buildNewTopic(KafkaConfig.KafkaTopicConfiguration configuration) {
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
