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

}
