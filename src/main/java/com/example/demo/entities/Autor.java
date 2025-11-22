package com.example.demo.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idAutor;
    @Column(length=100)
    private String nome;
    @Column(length=100)
    private String nacionalidade;
    @Column(length=10)
    private Date dataNascimento;
    @Column(length=200)
    private String biografia;

    public Autor() {
    }

    // Construtor parametrizado
    public Autor(Long idAutor, String nome, String nacionalidade, Date dataNascimento, String biografia) {
        this.idAutor = idAutor;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }

}

