package com.shoppingcart.CartService.controller;

import com.shoppingcart.CartService.entity.CartModel;
import com.shoppingcart.CartService.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    // Add item to cart
    @PostMapping("/add")
    public ResponseEntity<String> addItemToCart(@RequestBody CartModel cartItem) {
        cartService.addItem(cartItem);
        return ResponseEntity.ok("Item added to cart successfully.");
    }

    // Remove item from cart
    @DeleteMapping("/remove/{productId}")
    public ResponseEntity<String> removeItemFromCart(@PathVariable String productId) {
        cartService.removeItem(productId);
        return ResponseEntity.ok("Item removed from cart successfully.");
    }

    // View cart
    @GetMapping("/view")
    public ResponseEntity<Map<String, CartModel>> viewCart() {
        return ResponseEntity.ok(cartService.getCartItems());

    }

}
