package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.Debt;

import java.util.List;

public record PessoaResponseDTO(
        Long id,
        String name,
        List<DebtDTO> debts
) {
    public static PessoaResponseDTO with(Long id, String name, List<Debt> debts) {
        return new PessoaResponseDTO(
                id,
                name,
                debts.stream().map(debt ->
                        DebtDTO.with(debt.getId(), debt.getName(), debt.getDescription(), debt.getCategory())
                ).toList()
        );
    }
}
