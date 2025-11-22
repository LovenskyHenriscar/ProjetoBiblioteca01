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
        this.idUsuario = idUsuario;
        this.nome=nome;
        this.cpf=cpf;
        this.endereco=endereco;
        this.telefone=telefone;
        this.email=email;
        this.dataCadastro=dataCadastro;
        this.emprestimosAtivos=emprestimosAtivos;

    }

}


