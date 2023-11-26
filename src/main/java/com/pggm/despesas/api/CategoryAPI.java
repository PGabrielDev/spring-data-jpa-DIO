package com.pggm.despesas.api;

import com.pggm.despesas.Dtos.CategoryResponseDTO;
import com.pggm.despesas.Dtos.CreateCategoryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping(value = "v1/despesas/categoria")
public interface CategoryAPI {

    @PostMapping
    ResponseEntity<CategoryResponseDTO> create(@RequestBody CreateCategoryDTO categoryDTO);

    @GetMapping
    ResponseEntity<List<CategoryResponseDTO>> getAll();

}
