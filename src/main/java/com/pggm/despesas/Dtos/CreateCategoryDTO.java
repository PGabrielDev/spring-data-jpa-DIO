package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.Category;

public record CreateCategoryDTO(
        String category
) {
    public Category toCategoryPersistenci(){
        return Category.builder()
                .category(category)
                .build();
    }
}
