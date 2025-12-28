package com.javaProject.java.repository;

import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

    com.javaProject.java.entity.Category save(com.javaProject.java.entity.Category category);
    
}
