package com.pggm.despesas.persistence.repository;

import com.pggm.despesas.persistence.PessoaPersistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaPersistence, Long> {
}
