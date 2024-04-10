package com.agile.echo.config;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "topic", groupId = "${kafkaconsumer.topic.group.id:kafka.group_01}")
    public void messageConsumerFromOcppMeterValue(String consumedMessage) throws IOException {
        log.info("Message consumed from Kafka topic -- \n {} ", consumedMessage);
    }
}
