package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.Category;

import java.util.Calendar;

public record CategoryDTO(
        Long id,
        String category

) {
    public Category ToCategoryPersitence() {
        return new Category(id, category);
    }
}
