package com.preetham.MultiDBConfig.service;


import org.springframework.web.bind.annotation.*;

import com.preetham.MultiDBConfig.kafka.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class MessageController {

    private final KafkaProducer producer;

    public MessageController(KafkaProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/send")
    public String send(@RequestParam String message) {

        producer.sendMessage(message);

        return "Message Sent Successfully";
    }
}
