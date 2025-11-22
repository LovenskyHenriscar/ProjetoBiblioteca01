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


   public Multa(){

   }

    public Multa(Long idMulta,Integer valor,Date dataGeracao,String motivo,String pago){

        this.idMulta=idMulta;
        this.valor=valor;
        this.dataGeracao=dataGeracao;
        this.motivo=motivo;
        this.pago=pago;

    }

}
