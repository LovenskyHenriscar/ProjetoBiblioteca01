package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idMulta;
   private Integer valor;
 private Date dataGeracao;
 private String motivo;
 private String pago;


}
