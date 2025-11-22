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


    public Categoria() {
    }

    // Construtor parametrizado
    public Categoria(Long idCategoria, String nome, String descricao, String livros) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.livros = livros;
    }

}
