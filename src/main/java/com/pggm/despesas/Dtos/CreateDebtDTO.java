package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.Debt;

public record CreateDebtDTO(
        String name,
        String description
) {
    public Debt toDebtPersistence(){
        return Debt.builder()
                .name(name)
                .description(description)
                .build();
    }
}

