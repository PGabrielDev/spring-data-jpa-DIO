package com.pggm.despesas.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "pessoas")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PessoaPersistence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Debt> debts;

}
