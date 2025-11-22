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

        this.setIdMulta(idMulta);
        this.setValor(valor);
        this.setDataGeracao(dataGeracao);
        this.setMotivo(motivo);
        this.setPago(pago);

    }

    public Long getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(Long idMulta) {
        this.idMulta = idMulta;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
}
