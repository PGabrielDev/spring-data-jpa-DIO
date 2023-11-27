package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.Category;
import com.pggm.despesas.persistence.Debt;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public record DebtDTO(

        String name,
        String description,

        CategoryDTO category
) {

    public Debt toDebtPersistence() {
        return Debt.builder()
                .name(name)
                .description(description)
                .category(category.ToCategoryPersitence())
                .build();
    }

    public static DebtDTO with(Long id, String name, String description, Category category) {
        return new DebtDTO(
                name,
                description,
                CategoryDTO.with(
                        category.getId(),
                        category.getCategory()
                )
        );
    }
}
