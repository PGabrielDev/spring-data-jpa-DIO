package com.pggm.despesas.Dtos;

import com.pggm.despesas.persistence.repository.CategoryRepository;

public record CategoryResponseDTO(
        Long id,
        String category

) {
    public static CategoryResponseDTO with (Long id, String category) {
        return new CategoryResponseDTO(id, category);
    }

}
