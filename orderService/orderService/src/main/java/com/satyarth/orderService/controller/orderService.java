package com.satyarth.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> order(@RequestBody String order) {

        System.out.println("Order is : "+order);
        // trigger an event

        kafkaTemplate.send("orderTopic","Order_Created "+order)
                .whenComplete((stringStringSendResult, throwable) ->{
                    if(throwable == null){
                        System.out.println(stringStringSendResult);
                    }else{
                        System.out.println(throwable.toString());
                    }

                });

        return ResponseEntity.ok("Order created successfully!");
    }
}
