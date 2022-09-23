package com.example.kafkaProject.Controller;
import com.example.kafkaProject.domain.msgContent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/messages")
public class messageController {

    private final KafkaTemplate<String,String> kafkaTemplate;
    // kafkatemplate is a class which is used to produce msg to the topic
    // having some methods like send()
    public messageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @PostMapping
    public void publish(@RequestBody msgContent msg){
        kafkaTemplate.send("demo-topic",msg.getMessage());

    }
}
