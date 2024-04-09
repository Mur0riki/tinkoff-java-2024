package edu.java.bot.configuration.kafkaConfiguration;

import jakarta.validation.constraints.NotNull;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "kafka", ignoreUnknownFields = false)
public record KafkaConfig(

    @NotNull
    Set<KafkaTopicConfiguration> topicConfigurations,

    @NotNull
    ConsumerConfiguration consumerConfiguration,

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

    public record ConsumerConfiguration(
        String bootstrapServers,
        String groupId,
        String autoOffsetReset,
        Boolean enableAutoCommit,
        Integer maxPollInterval,
        Integer concurrency
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
