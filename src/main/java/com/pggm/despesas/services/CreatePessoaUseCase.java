package com.pggm.despesas.services;

import com.pggm.despesas.Dtos.CreatePessoaDTO;
import com.pggm.despesas.Dtos.PessoaResponseDTO;
import com.pggm.despesas.persistence.repository.PessoaRepository;
import com.pggm.despesas.services.interfaces.ICreatePersonUseCase;

public class CreatePessoaUseCase implements ICreatePersonUseCase {
    private PessoaRepository repository;

    @Override
    public PessoaResponseDTO execute(CreatePessoaDTO input) {
        return null;
    }
}
