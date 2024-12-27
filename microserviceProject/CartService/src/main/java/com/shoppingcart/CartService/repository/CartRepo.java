package com.shoppingcart.CartService.repository;

import com.shoppingcart.CartService.entity.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CartRepo  extends JpaRepository<CartModel,Integer> {
/*
    List<CartModel> findByCategory(String category);
*/


}


