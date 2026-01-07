package com.example.spring_event_demo.listeners;

import com.example.spring_event_demo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class LogOrderDetailsListener {

    @EventListener
    @Order(1)
    public void logOrderCreated(OrderCreatedEvent event){
        System.out.println("Order placed for orderId "+event.getOrderId());
    }

}
