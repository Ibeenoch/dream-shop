package com.dailycodework.dreamshops.repository;

import com.dailycodework.dreamshops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory_Name(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByCategory_NameAndBrand(String category, String brand);
    List<Product> findProductByName(String name);
    List<Product> findByBrandAndName(String brand, String name);
    Long countProductByBrandAndName(String brand, String name);

    Boolean existsByNameAndBrand(String name, String brand);
}

