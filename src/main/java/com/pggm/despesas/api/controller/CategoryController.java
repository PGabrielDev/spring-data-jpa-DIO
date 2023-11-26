package com.pggm.despesas.api.controller;

import com.pggm.despesas.Dtos.CategoryResponseDTO;
import com.pggm.despesas.Dtos.CreateCategoryDTO;
import com.pggm.despesas.api.CategoryAPI;
import com.pggm.despesas.services.interfaces.ICreateCategoryUseCase;
import com.pggm.despesas.services.interfaces.IGetAllCategoriesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController implements CategoryAPI {

    private final ICreateCategoryUseCase createCategoryUseCase;
    private final IGetAllCategoriesUseCase getAllCategoriesUseCase;
    @Override
    public ResponseEntity<CategoryResponseDTO> create(CreateCategoryDTO categoryDTO) {
        final var response = createCategoryUseCase.execute(categoryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

    @Override
    public ResponseEntity<List<CategoryResponseDTO>> getAll() {
        final var response = getAllCategoriesUseCase.execute();
        return ResponseEntity.ok(response);
    }


}
