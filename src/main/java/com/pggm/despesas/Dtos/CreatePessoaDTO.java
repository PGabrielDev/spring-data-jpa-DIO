package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.PessoaPersistence;

import java.util.List;

public record CreatePessoaDTO(
        String name,
        List<DebtDTO> debts
) {
    public PessoaPersistence toPerssoaPersistence(){
        return PessoaPersistence.builder()
                .name(name)
                .debts(debts.stream().map(DebtDTO::toDebtPersistence).toList())
                .build();
    }
}
