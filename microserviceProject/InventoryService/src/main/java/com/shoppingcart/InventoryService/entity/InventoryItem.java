package com.shoppingcart.InventoryService.entity;
import jakarta.persistence.*;
@Entity
@Table (name = "inventorydb")
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productCode;
    private Integer availableQuantity ;

    public InventoryItem(int id, String productCode, Integer availableQuantity) {
        this.id = id;
        this.productCode = productCode;
        this.availableQuantity = availableQuantity;
    }

    public InventoryItem() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}








