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

}
