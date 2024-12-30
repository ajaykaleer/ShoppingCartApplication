package com.shoppingcart.OrderService.controller;

import com.shoppingcart.OrderService.entity.OrderItem;
import com.shoppingcart.OrderService.repository.OrderRepo;
import com.shoppingcart.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;



    @GetMapping("/api/orders")
    public List<OrderItem> getAllOrders() {
        return orderService.getAllOrders();
    }
    @PostMapping
    public ResponseEntity<OrderItem> createOrder(@RequestBody OrderItem orderItem) {
        OrderItem createdOrder = orderService.createOrder(orderItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }


//    @GetMapping("/api/orders/{id}")
//    public Optional<OrderItem> findOrderById(@PathVariable Long id) {
//        return repo.findById(id);
//    }
}