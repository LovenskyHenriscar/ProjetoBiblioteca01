package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idCategoria;
    private String  nome;
    private String descricao;
    private String  livros;

}
