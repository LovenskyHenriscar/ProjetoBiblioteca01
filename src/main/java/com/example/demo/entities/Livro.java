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

    public Livro(){

    }

    public  Livro( Long idLivro, String titulo,String autor,String editora,
                   Date anoPublicacao, String isbn,String genero,
                   Double quantidadeExemplares,Double exemplaresDisponiveis){

        this.idLivro=idLivro;
        this.titulo=titulo;
        this.autor= autor;
        this.editora=editora;
        this.anoPublicacao=anoPublicacao;
        this.isbn=isbn;
        this.genero=genero;
        this.quantidadeExemplares= quantidadeExemplares;
        this.exemplaresDisponiveis=exemplaresDisponiveis;
    }

}
