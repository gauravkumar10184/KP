package com.example.kafkaProject;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkaListener {

    @KafkaListener(
            topics="demo-topic",
            groupId = "groupId"
    )
     void listener(String data){
      System.out.println("Message "+data);
     }
}
