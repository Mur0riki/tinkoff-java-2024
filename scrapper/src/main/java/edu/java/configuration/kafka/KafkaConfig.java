package edu.java.configuration.kafka;

import jakarta.validation.constraints.NotNull;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "kafka", ignoreUnknownFields = false)
public record KafkaConfig(
    Set<KafkaTopicConfiguration> topicConfigurations,

    ProducerConfiguration producerConfiguration

) {

    public record KafkaTopicConfiguration(
        @NotNull String name,
        Integer partitions,
        Integer replicas
    ) {
    }

    public record ProducerConfiguration(
        @NotNull String bootstrapServers,
        String clientId,
        String acksConfig,
        Integer deliveryTimeout,
        Integer lingerMs,
        Integer batchSize,
        Boolean enableIdempotence
    ) {

    }
}
