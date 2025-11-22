package com.example.demo.entities;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idUsuario;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Date dataCadastro;
    private Double emprestimosAtivos;





    public Usuario() {
    }

    // Construtor com argumentos
    public Usuario(Long idUsuario, String nome,String cpf,String endereco,String telefone,String email,Date dataCadastro,Double emprestimosAtivos) {
        this.setIdUsuario(idUsuario);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setDataCadastro(dataCadastro);
        this.setEmprestimosAtivos(emprestimosAtivos);

    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public void setEmprestimosAtivos(Double emprestimosAtivos) {
        this.emprestimosAtivos = emprestimosAtivos;
    }
}


