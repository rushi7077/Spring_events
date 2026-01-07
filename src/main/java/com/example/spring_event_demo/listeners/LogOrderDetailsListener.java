package com.example.spring_event_demo.listeners;

import com.example.spring_event_demo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LogOrderDetailsListener {

    @EventListener
    public void logOrderCreated(OrderCreatedEvent event){
        System.out.println("Order placed for orderId "+event.getOrderId());
    }

}
