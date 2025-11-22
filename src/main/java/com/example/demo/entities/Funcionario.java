package com.example.demo.entities;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idFuncionario;
    private Date dataEmprestimo;
    private Date dataDevolucaoPrevista;
    private Date  dataDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;

    public Funcionario () {}

    public  Funcionario(Long idFuncionario,Date dataEmprestimo,Date dataDevolucaoPrevista,Date  dataDevolucaoReal,String status,String livro,String usuario)
    {
        this.setIdFuncionario(idFuncionario);
        this.setDataEmprestimo(dataEmprestimo);
        this.setDataDevolucaoPrevista(dataDevolucaoPrevista);
        this.setDataDevolucaoReal(dataDevolucaoReal);
        this.setStatus(status);
        this.setLivro(livro);
        this.setUsuario(usuario);


    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(Date dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Date getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(Date dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
