package com.pggm.despesas.api;

import com.pggm.despesas.Dtos.AddDebtDTO;
import com.pggm.despesas.Dtos.CreatePessoaDTO;
import com.pggm.despesas.Dtos.PessoaResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(value = "v1/despesas/pessoa")
public interface PersonAPI {

    @PostMapping
    ResponseEntity<PessoaResponseDTO> create(@RequestBody CreatePessoaDTO request);

    @PostMapping(value = "adddebts")
    ResponseEntity<Void> addDebte(@RequestBody AddDebtDTO request) throws Exception;

    @GetMapping
    ResponseEntity<List<PessoaResponseDTO>> getAllpersons();

}
