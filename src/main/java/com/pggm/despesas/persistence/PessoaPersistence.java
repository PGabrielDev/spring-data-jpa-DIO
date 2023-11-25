package com.pggm.despesas.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "pessoas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaPersistence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @OneToMany
    private List<Debt> debts;

}
