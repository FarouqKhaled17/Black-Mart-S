package com.ecommerce.e_commerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "category",
            cascade = CascadeType.ALL,
            fetch=FetchType.LAZY)
    private Set<Product>products;
}
