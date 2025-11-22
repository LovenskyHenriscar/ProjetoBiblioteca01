package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idEndereco;
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(){}

    public  Endereco(Long idEndereco,String rua, Integer numero, String bairro,String cidade,String estado,String cep)
    {
        this.idEndereco=idEndereco;
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
        this.estado = estado;
        this.cep=cep;


    }
}
