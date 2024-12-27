package com.shoppingcart.CatalogService.controller;

import com.shoppingcart.CatalogService.entity.Product;
import com.shoppingcart.CatalogService.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;

    }

    @GetMapping("/allProduct")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/getProductById")
    public ResponseEntity<Product> getProductById(@RequestParam int productId) {
        Product product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Long> addProduct(@RequestBody Product product) {

      long productId =  productService.addProduct(product);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productId, @RequestBody Product product) {
       Product productRequest= productService.updateProduct(productId, product);
        return new ResponseEntity<>(productRequest, HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<String> deleteProduct(@RequestParam int productId) {
        productService.deleteProduct(productId);
        return new ResponseEntity<>("Product deleted", HttpStatus.OK);
    }

    }


