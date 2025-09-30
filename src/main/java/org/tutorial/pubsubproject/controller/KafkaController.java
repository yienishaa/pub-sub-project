package org.tutorial.pubsubproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tutorial.pubsubproject.service.MessageProducer;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("topic1", message);
        return "Message sent "+message;
    }
}
