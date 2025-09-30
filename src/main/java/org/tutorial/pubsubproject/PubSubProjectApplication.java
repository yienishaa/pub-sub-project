package org.tutorial.pubsubproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tutorial.pubsubproject.configuration.KafkaProducerConfig;

@SpringBootApplication
public class PubSubProjectApplication {



    public static void main(String[] args) {

        SpringApplication.run(PubSubProjectApplication.class, args);
    }

}
