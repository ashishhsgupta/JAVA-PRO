package com.javaProject.java.dto;

import java.util.List;
import lombok.*;

@Data @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Long id;
    private String name;
    private List<ProductDto> products;
}
