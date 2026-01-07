package com.example.spring_event_demo.listeners;

import com.example.spring_event_demo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @EventListener
    @Order(2)
    public void handleOrderCreatedAndSendEmail(OrderCreatedEvent event){
        System.out.println("Sending email for order "+event.getOrderId());
    }
}
