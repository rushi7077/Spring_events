package com.example.spring_event_demo.controller;

import com.example.spring_event_demo.services.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{orderId}")
    public String placeOrder(@PathVariable String orderId){
        orderService.createOrder(orderId);
        return "Order placed successfully "+orderId;
    }
}
