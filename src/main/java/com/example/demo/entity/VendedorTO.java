package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "vendedor")
public class VendedorTO extends BaseTO{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String documento;

    @OneToMany
    private List<ProdutoTO> produtos;

    @OneToMany
    private List<ClienteTO> clientes;



}
