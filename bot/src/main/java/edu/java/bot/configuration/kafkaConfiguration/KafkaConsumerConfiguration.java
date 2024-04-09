package edu.java.bot.configuration.kafkaConfiguration;


import java.util.HashMap;
import java.util.Map;
import edu.java.bot.restApi.dto.request.LinkUpdate;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.CommonErrorHandler;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
@EnableKafka
public class KafkaConsumerConfiguration {

    private final KafkaConfig.ConsumerConfiguration consumerConfig;

    public KafkaConsumerConfiguration(KafkaConfig kafkaConfig) {
        consumerConfig = kafkaConfig.consumerConfiguration();
    }

    @Bean
    KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, LinkUpdate>> kafkaListenerContainerFactory(
    ) {
        ConcurrentKafkaListenerContainerFactory<String, LinkUpdate> factory =
            new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        if(consumerConfig.concurrency() != null){
            factory.setConcurrency(consumerConfig.concurrency());
        }
        factory.getContainerProperties().setPollTimeout(3000);
        return factory;
    }

    @Bean
    public ConsumerFactory<String, LinkUpdate> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerProperties());
    }

    public Map<String, Object> consumerProperties() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer.class);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer.class);
        props.put(ErrorHandlingDeserializer.KEY_DESERIALIZER_CLASS, StringDeserializer.class);
        props.put(JsonDeserializer.KEY_DEFAULT_TYPE, String.class);
        props.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class);
        props.put(JsonDeserializer.VALUE_DEFAULT_TYPE, LinkUpdate.class);
        props.put(JsonDeserializer.USE_TYPE_INFO_HEADERS, false);
        props.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, consumerConfig.bootstrapServers());
        setGroupId(props);
        setAutoOffset(props);
        setEnableAutoCommit(props);
        setMaxPollInterval(props);
        return props;
    }
    private void setGroupId(Map<String, Object> props) {
        if (consumerConfig.groupId() != null) {
            props.put(ConsumerConfig.GROUP_ID_CONFIG, consumerConfig.groupId());
        }
    }

    private void setAutoOffset(Map<String, Object> props) {
        if (consumerConfig.autoOffsetReset() != null) {
            props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, consumerConfig.autoOffsetReset());
        }
    }

    private void setEnableAutoCommit(Map<String, Object> props) {
        if (consumerConfig.enableAutoCommit() != null) {
            props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, consumerConfig.enableAutoCommit());
        }
    }

    private void setMaxPollInterval(Map<String, Object> props) {
        if (consumerConfig.maxPollInterval() != null) {
            props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, consumerConfig.maxPollInterval());
        }
    }

}
