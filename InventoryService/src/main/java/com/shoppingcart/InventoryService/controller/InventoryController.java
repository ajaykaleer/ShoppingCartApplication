package com.shoppingcart.InventoryService.controller;

import com.shoppingcart.InventoryService.entity.InventoryItem;
import com.shoppingcart.InventoryService.repository.InventoryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/inventory")

public class InventoryController {

    @Autowired
    public InventoryItemRepo inventoryItemRepo;


    public InventoryController( InventoryItemRepo inventoryItemRepo) {
        this.inventoryItemRepo = inventoryItemRepo;
    }
    @GetMapping("/{productCode}")
    public ResponseEntity findInventoryByProductCode(@PathVariable("productCode") String productCode) {
        Optional<InventoryItem> inventoryItem = inventoryItemRepo.findByProductCode(productCode);
        if(inventoryItem.isPresent()) {
            return new ResponseEntity(inventoryItem, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}
//@PostMapping
//public ResponseEntity<InventoryItem> addInventoryItem(@Valid @RequestBody InventoryItem inventoryItem) {
//    if (inventoryItemRepo.existsByProductCode(inventoryItem.getProductCode())) {
//        return new ResponseEntity<>(HttpStatus.CONFLICT); // Conflict if the product already exists
//    }
//    InventoryItem savedItem = inventoryItemRepo.save(inventoryItem);
//    return new ResponseEntity<>(savedItem, HttpStatus.CREATED)
