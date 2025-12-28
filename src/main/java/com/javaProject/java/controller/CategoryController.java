package com.javaProject.java.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaProject.java.dto.CategoryDto;
import com.javaProject.java.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;
    
    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryDto categoryDto){
        return categoryService.createCategory(categoryDto);
    }
    //get all category
    //create category
    //get category by id
    //delete category
    
}
