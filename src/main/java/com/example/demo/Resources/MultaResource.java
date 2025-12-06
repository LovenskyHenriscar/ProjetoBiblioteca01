package com.example.demo.Resources;


import com.example.demo.Service.AutorService;
import com.example.demo.Service.MultaService;
import com.example.demo.entities.Multa;
import com.example.demo.entities.Reserva;
import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/multas")
public class MultaResource {
    @Autowired
    private MultaService service;
    @GetMapping
    public ResponseEntity<List<Multa>> findAll(){
        List<Multa> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idMulta")
    public ResponseEntity<Multa> findById(@PathVariable Long idMulta){
        Multa obj= service.findById(idMulta);
        return  ResponseEntity.ok().body(obj);
    }
}
