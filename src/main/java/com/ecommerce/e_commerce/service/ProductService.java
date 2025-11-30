package com.ecommerce.e_commerce.service;

import com.ecommerce.e_commerce.model.Product;
import com.ecommerce.e_commerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    To get all products
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
//    To get product by category id
    public List<Product> getProductsByCategoryId(Long categoryId){
       return productRepository.findByCategoryId(categoryId);
    }
}
