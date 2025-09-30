package org.tutorial.pubsubproject.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "topic1", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
