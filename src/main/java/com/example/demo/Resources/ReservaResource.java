package com.example.demo.Resources;


import com.example.demo.Service.AutorService;
import com.example.demo.Service.ReservaService;
import com.example.demo.entities.Reserva;
import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/reservas")
public class ReservaResource {
    @Autowired
    private ReservaService service;

    @GetMapping
    public ResponseEntity<List<Reserva>> findAll(){
        List<Reserva> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idReserva")
    public ResponseEntity<Reserva> findById(@PathVariable Long idReserva){
        Reserva obj= service.findById(idReserva);
        return  ResponseEntity.ok().body(obj);
    }
}
