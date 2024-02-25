package com.satyarth.notificationService.orderListener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class orderListenerNotification {
    @KafkaListener(id = "notificationListener",topics = "orderTopic")
    @RetryableTopic(attempts = "3" , backoff = @Backoff(delay = 2000L,maxDelay = 10000L,multiplier = 2))
    public void ConsumerOrderEvents(String records){
        System.out.println("Recieved Event: "+records);
        throw new RuntimeException();
    }
}
