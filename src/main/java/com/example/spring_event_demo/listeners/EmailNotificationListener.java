package com.example.spring_event_demo.listeners;

import com.example.spring_event_demo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @EventListener
    public void handleOrderCreatedAndSendEmail(OrderCreatedEvent event){
        System.out.println("Sending email for order "+event.getOrderId());
    }
}
