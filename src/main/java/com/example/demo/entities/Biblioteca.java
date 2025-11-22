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
    private  List listaDeLivros;
    private List listaDeUsuarios;
    private  List funcionarios;
}
