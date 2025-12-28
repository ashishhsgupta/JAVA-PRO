package com.javaProject.java.mapper;


import com.javaProject.java.dto.ProductDto;
import com.javaProject.java.entity.Product;
import com.javaProject.java.entity.Category;

public class ProductMapper {
    
    public static ProductDto toProductDto(Product product){
        return new ProductDto(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getCategory().getId()
        );
    }

   public static Product toProductEntity(ProductDto productDto, Category category){
    Product product = new Product();
    product.setName(productDto.getName());
    product.setDescription(productDto.getDescription());
    product.setPrice(productDto.getPrice());
    product.setCategory(category);

    return product;
   }

}
