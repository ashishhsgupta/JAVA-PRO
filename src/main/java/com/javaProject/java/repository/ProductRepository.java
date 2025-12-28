package com.javaProject.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaProject.java.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
