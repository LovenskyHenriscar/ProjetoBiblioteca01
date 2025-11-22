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



}
