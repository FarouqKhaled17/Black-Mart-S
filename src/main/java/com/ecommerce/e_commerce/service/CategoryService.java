package com.ecommerce.e_commerce.service;

import com.ecommerce.e_commerce.model.Category;
import com.ecommerce.e_commerce.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
