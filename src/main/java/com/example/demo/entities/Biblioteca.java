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
        this.setIdBiblioteca(idBiblioteca);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setListaDeLivros(listaDeLivros);
        this.setListaDeUsuarios(listaDeUsuarios);
        this.setListaDeFuncionarios(listaDeFuncionarios);
    }


    public Long getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(Long idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public List<Livro> getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(List<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public List<Funcionario> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<Funcionario> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
}
