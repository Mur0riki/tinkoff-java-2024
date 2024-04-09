package edu.java.bot.configuration.kafkaConfiguration;


import java.util.HashMap;
import java.util.Map;
import edu.java.bot.restApi.dto.request.LinkUpdate;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


@Configuration
public class KafkaProducerConfiguration {

    private final KafkaConfig.ProducerConfiguration producerConfig;

    public KafkaProducerConfiguration(KafkaConfig kafkaConfig) {
        producerConfig = kafkaConfig.producerConfiguration();
    }
    @Bean
    public KafkaTemplate<String, byte[]> retryableTopicKafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    @Bean
    public ProducerFactory<String, byte[]> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs(), new StringSerializer(), new ByteArraySerializer());
    }

    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, producerConfig.bootstrapServers());
        setClientId(props);
        setAcks(props);
        setDeliveryTimeout(props);
        setLingerMs(props);
        setBatchSize(props);
        setEnableIdempotence(props);
        return props;
    }
    private void setClientId(Map<String, Object> props) {
        if (producerConfig.clientId() != null) {
            props.put(ProducerConfig.CLIENT_ID_CONFIG, producerConfig.clientId());
        }
    }

    private void setAcks(Map<String, Object> props) {
        if (producerConfig.acksConfig() != null) {
            props.put(ProducerConfig.ACKS_CONFIG, producerConfig.acksConfig());
        }

    }

    private void setDeliveryTimeout(Map<String, Object> props) {
        if (producerConfig.deliveryTimeout() != null) {
            props.put(ProducerConfig.DELIVERY_TIMEOUT_MS_CONFIG, producerConfig.deliveryTimeout());
        }
    }

    private void setBatchSize(Map<String, Object> props) {
        if (producerConfig.batchSize() != null) {
            props.put(ProducerConfig.BATCH_SIZE_CONFIG, producerConfig.batchSize());
        }
    }

    private void setLingerMs(Map<String, Object> props) {
        if (producerConfig.lingerMs() != null) {
            props.put(ProducerConfig.LINGER_MS_CONFIG, producerConfig.lingerMs());
        }
    }

    private void setEnableIdempotence(Map<String, Object> props) {
        if (producerConfig.enableIdempotence() != null) {
            props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, producerConfig.enableIdempotence());
        }
    }

}
