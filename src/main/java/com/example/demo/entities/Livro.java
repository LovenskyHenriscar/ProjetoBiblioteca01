package com.example.demo.entities;
import jakarta.persistence.*;

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

        this.setIdLivro(idLivro);
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEditora(editora);
        this.setAnoPublicacao(anoPublicacao);
        this.setIsbn(isbn);
        this.setGenero(genero);
        this.setQuantidadeExemplares(quantidadeExemplares);
        this.setExemplaresDisponiveis(exemplaresDisponiveis);
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(Long idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getQuantidadeExemplares() {
        return quantidadeExemplares;
    }

    public void setQuantidadeExemplares(Double quantidadeExemplares) {
        this.quantidadeExemplares = quantidadeExemplares;
    }

    public Double getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(Double exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
}
