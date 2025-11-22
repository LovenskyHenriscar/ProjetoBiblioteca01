package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long ideditora;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
}
