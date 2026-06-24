package com.dailycodework.dreamshops.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;

//relationship Many represent the product (this) one represent the category
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    //relationship One represent product, Many represent the Image
    //mappedBy = "product" This tells JPA: "The Image entity owns this relationship."
    // with this JPA knows:Image owns the foreign key, product owns the primary key
    //cascade = CascadeType.ALL This means: "When I perform an operation on Product, do the same operation on its Images."
    //Example: Delete Product, JPA automatically deletes: All related images
    // orphanRemoval = true If an image is removed from the product's image list, delete it from the database.
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images;

    public Product(String name, String brand, BigDecimal price, int inventory, String description, Category category) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.inventory = inventory;
        this.description = description;
        this.category = category;
    }

}
