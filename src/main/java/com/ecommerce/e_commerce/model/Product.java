package com.ecommerce.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String imgURL;

    @ManyToOne
    @JoinColumn(name = "category_id" , nullable = false)
    private Category category;
}
