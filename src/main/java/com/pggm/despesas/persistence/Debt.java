package com.pggm.despesas.persistence;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "debts")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, name = "nome")
    private String name;

    @Column(nullable = false, name = "descricao")
    private String description;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category category;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "pessoa_id")
    private PessoaPersistence pessoa;

}
