package com.example.spring_event_demo.services;

import com.example.spring_event_demo.events.OrderCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void createOrder(String orderId){
        //order creation logic
        System.out.println("Order is created "+orderId);
        publisher.publishEvent(new OrderCreatedEvent(orderId));
    }

}
