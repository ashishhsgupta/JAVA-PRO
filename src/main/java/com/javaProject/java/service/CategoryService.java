package com.javaProject.java.service;

import org.springframework.stereotype.Service;

import com.javaProject.java.dto.CategoryDto;
import com.javaProject.java.entity.Category;
import com.javaProject.java.mapper.CategoryMapper;
import com.javaProject.java.repository.CategoryRepository;

@Service
public class CategoryService {
    
    private CategoryRepository categoryRepository;

    public CategoryDto createCategory(CategoryDto categoryDto){
        Category category = CategoryMapper.toCategoryEntity(categoryDto);
        category = categoryRepository.save(category);
        return CategoryMapper.toCategoryDto(category);
        
    }
}
