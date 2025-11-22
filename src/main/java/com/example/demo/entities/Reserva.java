package com.example.demo.entities;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 11)
    private Long idReserva;
    private Date dataReserva;
    private String status;
    private String livro;
    private String usuario;



    public  Reserva(){}

    public  Reserva(Long idReserva,Date dataReserva,String status, String livro,String usuario){

        this.setIdReserva(idReserva);
        this.setDataReserva(dataReserva);
        this.setStatus(status);
        this.setLivro(livro);
        this.setUsuario(usuario);
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Long idReserva) {
        this.idReserva = idReserva;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
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
