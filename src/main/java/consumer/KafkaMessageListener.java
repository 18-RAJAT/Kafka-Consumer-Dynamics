package consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
    private static final Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka-topic-4", groupId = "logger-1")
    public void consume(String message) {
        log.info("Consumer received message: {}", message);
    }
}
