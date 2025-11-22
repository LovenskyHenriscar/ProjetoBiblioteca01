package com.example.demo.entities;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idLivro;
    private String titulo;
    private String autor;
    private String editora;
    private Date anoPublicacao;
    private String isbn;
    private String genero;
    private Double quantidadeExemplares;
    private Double exemplaresDisponiveis;

}
