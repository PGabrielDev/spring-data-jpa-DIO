package com.pggm.despesas.persistence;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "debts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, name = "nome")
    private String name;

    @Column(nullable = false, name = "descricao")
    private String description;


    @OneToOne(targetEntity = Category.class)
    private Category category;

}
