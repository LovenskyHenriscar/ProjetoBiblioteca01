package com.example.demo.entities;

import jakarta.persistence.*;

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
        this.setIdAutor(idAutor);
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setDataNascimento(dataNascimento);
        this.setBiografia(biografia);
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

