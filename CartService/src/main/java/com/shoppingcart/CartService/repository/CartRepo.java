package com.shoppingcart.CartService.repository;

import com.shoppingcart.CartService.entity.CartModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepo  extends JpaRepository<CartModel,Integer> {
/*
    List<CartModel> findByCategory(String category);
*/


}


