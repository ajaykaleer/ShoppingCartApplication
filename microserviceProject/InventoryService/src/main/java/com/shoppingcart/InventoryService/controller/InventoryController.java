package com.shoppingcart.InventoryService.controller;

import com.shoppingcart.InventoryService.entity.InventoryItem;
import com.shoppingcart.InventoryService.repository.InventoryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class InventoryController {

    @Autowired
    public InventoryItemRepo inventoryItemRepo;


    public InventoryController( InventoryItemRepo inventoryItemRepo) {
        this.inventoryItemRepo = inventoryItemRepo;
    }
    @GetMapping("/api/inventory/{productCode}")
    public ResponseEntity findInventoryByProductCode(@PathVariable("productCode") String productCode) {
        Optional<InventoryItem> inventoryItem = inventoryItemRepo.findByProductCode(productCode);
        if(inventoryItem.isPresent()) {
            return new ResponseEntity(inventoryItem, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
