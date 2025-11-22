package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idBiblioteca;
    private String  nome;
    private String endereco;
    private Integer telefone;
    private  List<Livro> listaDeLivros;
    private List<Usuario> listaDeUsuarios;
    private  List<Funcionario> listaDeFuncionarios;

    public Biblioteca() {
    }

    // Construtor parametrizado
    public Biblioteca(Long idBiblioteca, String nome, String endereco, Integer telefone,
                      List<Livro> listaDeLivros, List<Usuario> listaDeUsuarios, List<Funcionario> listaDeFuncionarios ) {
        this.idBiblioteca = idBiblioteca;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listaDeLivros = listaDeLivros;
        this.listaDeUsuarios = listaDeUsuarios;
        this.listaDeFuncionarios = listaDeFuncionarios ;
    }

}
