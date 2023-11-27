package com.pggm.despesas.services;

import com.pggm.despesas.Dtos.CreatePessoaDTO;
import com.pggm.despesas.Dtos.PessoaResponseDTO;
import com.pggm.despesas.persistence.repository.CategoryRepository;
import com.pggm.despesas.persistence.repository.PessoaRepository;
import com.pggm.despesas.services.interfaces.ICreatePersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CreatePessoaUseCase implements ICreatePersonUseCase {


    private final PessoaRepository repository;

    @Override
    public PessoaResponseDTO execute(CreatePessoaDTO input) {
        final var pessoaPersistence = input.toPerssoaPersistence();
        pessoaPersistence.setDebts(pessoaPersistence.getDebts().stream().map(debt -> {
            debt.setPessoa(pessoaPersistence);
            return debt;
        }).toList());
        final var response = repository.save(pessoaPersistence);
        return PessoaResponseDTO.with(
                response.getId(),
                response.getName(),
                response.getDebts()
        );
    }
}
