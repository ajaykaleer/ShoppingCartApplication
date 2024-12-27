package com.shoppingcart.OrderService.service;
import com.shoppingcart.OrderService.entity.OrderItem;
import com.shoppingcart.OrderService.repository.OrderRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    // Get all orders


    public ArrayList getAllOrders() {
        return new ArrayList<>(orderRepo.findAll());
    }

    public OrderItem createOrder(OrderItem orderItem) {
        if (orderItem == null) {
            throw new IllegalArgumentException("Order item cannot be null.");
        }
        if (orderItem.getProductId() == 0 || orderItem.getQuantity() <= 0) {
            throw new IllegalArgumentException("Order item must have a valid product ID and quantity.");
        }

        return (OrderItem) orderRepo.save(orderItem);
    }

}
