package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.Category;
import com.pggm.despesas.persistence.Debt;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;

public record DebtDTO(
        Long id,
        String name,
        String description,

        CategoryDTO category
) {

    public Debt toDebtPersistence(){
        return new Debt(id,name,description, category.ToCategoryPersitence());
    }

}
