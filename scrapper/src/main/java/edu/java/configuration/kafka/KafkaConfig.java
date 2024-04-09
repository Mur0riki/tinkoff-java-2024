package edu.java.configuration.kafka;

import jakarta.validation.constraints.NotNull;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "kafka", ignoreUnknownFields = false)
public record KafkaConfig(
    @NotNull
    Set<KafkaTopicConfiguration> topicConfigurations,
    @NotNull
    ProducerConfiguration producerConfiguration,

    Integer retryableTopicAttempts,

    String dltTopicSuffix

) {

    public record KafkaTopicConfiguration(
        @NotNull String name,
        Integer partitions,
        Integer replicas
    ) {
    }

    public record ProducerConfiguration(
        @NotNull String bootstrapServers,
        @NotNull String linkUpdatesTopic,
        String clientId,
        String acksConfig,
        Integer deliveryTimeout,
        Integer lingerMs,
        Integer batchSize,
        Boolean enableIdempotence
    ) {

    }
}
