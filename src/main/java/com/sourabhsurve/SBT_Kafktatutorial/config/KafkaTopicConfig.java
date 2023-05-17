package com.sourabhsurve.SBT_Kafktatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    //create kafka topic

    @Bean
    public NewTopic javaTopic() {
        return TopicBuilder.name("java")
                .build();
    }

    @Bean
    public NewTopic javaJsonTopic() {
        return TopicBuilder.name("java_json")
                .build();
    }
}
