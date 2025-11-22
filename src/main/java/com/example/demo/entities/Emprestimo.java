package com.example.demo.entities;

import jakarta.persistence.*;
import org.aspectj.weaver.patterns.ThisOrTargetPointcut;

import java.util.Date;

@Entity
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idEmprestimo;
    private Date dataEmprestimo;
    private Date dataDevolucaoPrevista;
    private Date dataDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;

    public Emprestimo(){}

    public Emprestimo(Long idEmprestimo,Date dataEmprestimo,Date dataDevolucaoPrevista,Date dataDevolucaoReal,String status,String livro,String usuario)
    {
        this.idEmprestimo=idEmprestimo;
        this.dataEmprestimo=dataEmprestimo;
        this.dataDevolucaoPrevista=dataDevolucaoPrevista;
        this.dataDevolucaoReal=dataDevolucaoReal;
        this.status=status;
        this.livro=livro;
        this.usuario=usuario;

    }

}
