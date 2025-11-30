package com.ecommerce.e_commerce.config;

import com.ecommerce.e_commerce.model.Category;
import com.ecommerce.e_commerce.model.Product;
import com.ecommerce.e_commerce.repository.CategoryRepository;
import com.ecommerce.e_commerce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public DataSeeder(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Clear all existing data
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        // You can add initial data seeding logic here if needed
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category books = new Category();
        books.setName("Books");

        categoryRepository.saveAll(Arrays.asList(electronics, books));

        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("A high-end smartphone.");
        phone.setPrice(699.99);
        phone.setStock(50);
        phone.setImgURL("http://example.com/phone.jpg");
        phone.setCategory(electronics);

        Product novel = new Product();
        novel.setName("Novel Book");
        novel.setDescription("A fascinating novel.");
        novel.setPrice(19.99);
        novel.setStock(100);
        novel.setImgURL("http://example.com/novel.jpg");
        novel.setCategory(books);
        productRepository.saveAll(Arrays.asList(phone, novel));
    }
}
