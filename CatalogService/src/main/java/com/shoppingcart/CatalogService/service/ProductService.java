package com.shoppingcart.CatalogService.service;

import com.shoppingcart.CatalogService.entity.Product;
import com.shoppingcart.CatalogService.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    //fetching product details
    public List<Product> getAllProducts() {
        return  productRepo.findAll();
    }


    public Product getProductById(int productId) {
        return productRepo.findById(productId).get();
    }

    public long addProduct(Product product) {
        System.out.println(product);
     Product products=   productRepo.save(product);
     return products.getProductId();
    }

    public Product updateProduct(int productId, Product product) {
        Product existingProduct = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));

        existingProduct.setProductName(product.getProductName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return productRepo.save(existingProduct);

    }

    public void deleteProduct(int productId) {
        productRepo.deleteById(productId);
    }


}
