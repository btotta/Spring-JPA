package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseTO {



    @Column(nullable = false)
    private Date dataCriacao;

    @Column(nullable = false)
    private Date dataAtualizacao;

    @Column(nullable = false)
    private Date dataExclusao;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private Boolean ativo;


}
