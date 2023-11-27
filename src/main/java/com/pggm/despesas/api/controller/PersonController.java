package com.pggm.despesas.api.controller;

import com.pggm.despesas.Dtos.AddDebtDTO;
import com.pggm.despesas.Dtos.CreatePessoaDTO;
import com.pggm.despesas.Dtos.PessoaResponseDTO;
import com.pggm.despesas.api.PersonAPI;
import com.pggm.despesas.services.interfaces.IAddDebtUseCase;
import com.pggm.despesas.services.interfaces.ICreatePersonUseCase;
import com.pggm.despesas.services.interfaces.IGetAllCategoriesUseCase;
import com.pggm.despesas.services.interfaces.IGetAllPersonsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController implements PersonAPI {

    private final ICreatePersonUseCase createPersonUseCase;
    private final IAddDebtUseCase addDebtUseCase;
    private final IGetAllPersonsUseCase getAllPersonsUseCase;
    @Override
    public ResponseEntity<PessoaResponseDTO> create(CreatePessoaDTO request) {
        final var response = createPersonUseCase.execute(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<Void> addDebte(AddDebtDTO request) throws Exception {
        addDebtUseCase.execute(request);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<PessoaResponseDTO>> getAllpersons() {
        final var response = getAllPersonsUseCase.execute();
        return ResponseEntity.ok(response);
    }


}
