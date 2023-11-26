package com.pggm.despesas.services.interfaces;

import com.pggm.despesas.Dtos.CategoryResponseDTO;
import com.pggm.despesas.Dtos.CreateCategoryDTO;

public interface ICreateCategoryUseCase extends UseCase<CreateCategoryDTO, CategoryResponseDTO> {
    @Override
    CategoryResponseDTO execute(CreateCategoryDTO input);

}
