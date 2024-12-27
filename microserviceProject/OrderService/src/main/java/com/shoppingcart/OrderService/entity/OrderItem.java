package com.shoppingcart.OrderService.entity;

import jakarta.persistence.*;
//import lombok.*;



@Entity
@Table (name = "orderdb")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private int productId;
    private int quantity;
    private double orderPrice;

    public OrderItem(Long orderId, int productId, int quantity, double orderPrice) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.orderPrice = orderPrice;
    }

    public OrderItem() {

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", orderPrice=" + orderPrice +
                '}';
    }
}

