package com.shoppingcart.CartService.service;

import com.shoppingcart.CartService.entity.CartModel;
import com.shoppingcart.CartService.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepo;
    private Map<String, CartModel> cartModel = new HashMap<>();

    public void addItem(CartModel cartItem) {
        CartModel item = cartRepo.save(cartItem);
        CartModel.put(item.getItemId(), item);
    }

    public void removeItem(String itemId) {
        CartModel.remove(itemId);
    }

    public Map<String, CartModel> getCartItems() {
        int CartModel = 0;
        return new HashMap<>(CartModel);
    }

    public void clearCart() {
        CartModel.clear();
    }
}