package com.kandahar.kctech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kandahar.kctech.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}