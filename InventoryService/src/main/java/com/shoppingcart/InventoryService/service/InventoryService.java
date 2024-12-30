package com.shoppingcart.InventoryService.service;

import com.shoppingcart.InventoryService.entity.InventoryItem;
import com.shoppingcart.InventoryService.repository.InventoryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class InventoryService {

    private final InventoryItemRepo inventoryItemRepo;

    public InventoryService(InventoryItemRepo inventoryItemRepo) {
        this.inventoryItemRepo = inventoryItemRepo;
    }

    public InventoryItem addInventoryItem(InventoryItem item) {
        return inventoryItemRepo.save(item);
    }

    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemRepo.findAll();
    }

    public Optional<InventoryItem> getInventoryItemById(int id) {
        return inventoryItemRepo.findById(id);
    }

    public InventoryItem updateInventoryItem(InventoryItem item) {
        if (inventoryItemRepo.existsById(item.getId())) {
            return inventoryItemRepo.save(item);
        } else {
            throw new IllegalArgumentException("Inventory item not found with ID: " + item.getId());
        }
    }

    public void deleteInventoryItem(int id) {
        if (inventoryItemRepo.existsById(id)) {
            inventoryItemRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Inventory item not found with ID: " + id);

        }
    }


}
