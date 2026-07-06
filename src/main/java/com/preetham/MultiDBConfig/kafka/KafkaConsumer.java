package com.preetham.MultiDBConfig.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Received : " + message);
    }
}
