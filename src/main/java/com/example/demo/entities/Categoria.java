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
        this.setIdCategoria(idCategoria);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setLivros(livros);
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLivros() {
        return livros;
    }

    public void setLivros(String livros) {
        this.livros = livros;
    }
}
