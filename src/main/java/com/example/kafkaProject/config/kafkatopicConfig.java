package com.example.kafkaProject.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkatopicConfig {
    @Bean
    public NewTopic topicConfig(){
        //creation of topic with name "demo-topic"
        return TopicBuilder.name("demo-topic")
                .build();
    }
}
