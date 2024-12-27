package com.shoppingcart.CartService.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cartItem")

public class CartModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int cartid;
    private int cartItem;
    private int totalAmount;
    private int cartQuantity;

    public CartModel(int cartid, int cartQuantity, int totalAmount, int cartItem) {
        this.cartid = cartid;
        this.cartQuantity = cartQuantity;
        this.totalAmount = totalAmount;
        this.cartItem = cartItem;
    }

    public CartModel() {

    }

    public static void clear() {
    }

    public static void remove(String itemId) {
    }

    public static void put(Object itemId, CartModel item) {
    }

    public int getCartItem() {
        return cartItem;
    }

    public void setCartItem(int cartItem) {
        this.cartItem = cartItem;
    }

    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(int cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    @Override
    public String toString() {
        return "CartModel{" +
                "cartid=" + cartid +
                ", cartItem=" + cartItem +
                ", totalAmount=" + totalAmount +
                ", cartQuantity=" + cartQuantity +
                '}';
    }

    public Object getItemId() {
        return cartid;


    }
}
