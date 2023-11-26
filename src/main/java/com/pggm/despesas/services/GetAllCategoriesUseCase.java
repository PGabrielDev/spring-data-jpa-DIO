package com.pggm.despesas.services;

import com.pggm.despesas.Dtos.CategoryResponseDTO;
import com.pggm.despesas.persistence.repository.CategoryRepository;
import com.pggm.despesas.services.interfaces.IGetAllCategoriesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Component
public class GetAllCategoriesUseCase implements IGetAllCategoriesUseCase {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponseDTO> execute() {
        return categoryRepository.findAll().stream()
                .map(category ->
                        CategoryResponseDTO.with(category.getId(), category.getCategory())).collect(Collectors.toList());
    }
}
