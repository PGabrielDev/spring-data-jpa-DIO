package com.pggm.despesas.Dtos;

import java.util.List;

public record AddDebtDTO(
        Long personId,
        List<DebtDTO> debts
) {

}

