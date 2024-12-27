package com.shoppingcart.CartService.service;

import com.shoppingcart.CartService.entity.CartModel;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service

public class CartService<CartItem> {
    private Map<String, CartModel> cartModel = new HashMap<>();

    public void addItem(CartItem cartItem) {
        CartModel item =null;
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