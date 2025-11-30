package com.ecommerce.e_commerce.controller;

import com.ecommerce.e_commerce.model.Product;
import com.ecommerce.e_commerce.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }

//    Get All Products
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

//    Get Products by Category ID
    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Long categoryId){
        return productService.getProductsByCategoryId(categoryId);
    }
}
