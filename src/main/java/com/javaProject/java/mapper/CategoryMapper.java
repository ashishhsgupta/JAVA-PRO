package com.javaProject.java.mapper;

import com.javaProject.java.entity.Category;
import com.javaProject.java.dto.CategoryDto;


public class CategoryMapper {

    public static CategoryDto toCategoryDto(Category category){
        if(category == null){
            return null;
        }
        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setProducts(category.getProducts().stream().map(ProductMapper::toProductDto).toList());
        return categoryDto;
    }
    
    public static Category toCategoryEntity(CategoryDto categoryDto){
        Category category = new Category();
        category.setName(categoryDto.getName());
        return category;
    }
}
