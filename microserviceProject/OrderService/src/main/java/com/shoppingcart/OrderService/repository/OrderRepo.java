package com.shoppingcart.OrderService.repository;

import com.shoppingcart.OrderService.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo<order> extends JpaRepository<OrderItem, Long> {

}
