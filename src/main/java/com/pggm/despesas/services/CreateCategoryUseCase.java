package com.pggm.despesas.services;

import com.pggm.despesas.Dtos.CategoryResponseDTO;
import com.pggm.despesas.Dtos.CreateCategoryDTO;
import com.pggm.despesas.persistence.Category;
import com.pggm.despesas.persistence.repository.CategoryRepository;
import com.pggm.despesas.services.interfaces.ICreateCategoryUseCase;
import com.pggm.despesas.services.interfaces.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateCategoryUseCase implements ICreateCategoryUseCase {

    private final CategoryRepository categoryRepository;
    @Override
    public  CategoryResponseDTO execute(CreateCategoryDTO input) {
        final Category category = categoryRepository.save(input.toCategoryPersistenci());
        return CategoryResponseDTO.with(category.getId(), category.getCategory());
    }
}
