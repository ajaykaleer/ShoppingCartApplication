package com.shoppingcart.InventoryService.repository;

import com.shoppingcart.InventoryService.entity.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryItemRepo extends JpaRepository<InventoryItem, Integer> {
     Optional<InventoryItem> findByProductCode(String productCode);
    }

