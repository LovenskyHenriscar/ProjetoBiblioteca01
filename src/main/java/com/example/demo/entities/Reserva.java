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

        this.idReserva=idReserva;
        this.dataReserva=dataReserva;
        this.status=status;
        this.livro=livro;
        this.usuario=usuario;
    }

}
