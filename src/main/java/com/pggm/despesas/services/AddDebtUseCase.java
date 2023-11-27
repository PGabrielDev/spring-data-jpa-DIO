package com.pggm.despesas.services;

import com.pggm.despesas.Dtos.AddDebtDTO;
import com.pggm.despesas.persistence.PessoaPersistence;
import com.pggm.despesas.persistence.repository.PessoaRepository;
import com.pggm.despesas.services.interfaces.IAddDebtUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class AddDebtUseCase implements IAddDebtUseCase {
    private final PessoaRepository repository;
    @Override
    public void execute(AddDebtDTO input) throws Exception {
        final var idP = input.personId();
        final var debts = input.debts().stream().map(debt ->
                debt.toDebtPersistence()).collect(Collectors.toList());
        final var person = repository.findById(idP).orElseThrow(() -> new Exception("person not found"));
        final var personDebts = person.getDebts();
        personDebts.addAll(debts);
        person.setDebts(personDebts);
        repository.save(person);
    }
}
