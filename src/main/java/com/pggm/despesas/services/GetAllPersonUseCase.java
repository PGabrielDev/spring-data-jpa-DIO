package com.pggm.despesas.services;


import com.pggm.despesas.Dtos.PessoaResponseDTO;
import com.pggm.despesas.persistence.repository.PessoaRepository;
import com.pggm.despesas.services.interfaces.IGetAllPersonsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class GetAllPersonUseCase implements IGetAllPersonsUseCase {
    private final PessoaRepository repository;

    @Override
    public List<PessoaResponseDTO> execute() {
        return repository.findAll().stream().map(p ->
                PessoaResponseDTO.with(p.getId(),p.getName(),p.getDebts())).collect(Collectors.toList());
    }
}
