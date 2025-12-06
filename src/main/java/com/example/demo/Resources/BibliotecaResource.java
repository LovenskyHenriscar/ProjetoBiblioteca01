package com.example.demo.Resources;


import com.example.demo.Service.BibliotecaService;
import com.example.demo.Service.EnderecoService;
import com.example.demo.entities.Biblioteca;
import com.example.demo.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/bibliotecas")
public class BibliotecaResource {
    @Autowired
    private BibliotecaService service;

    @Autowired
    public ResponseEntity<List<Biblioteca>> findAll(){
        List<Biblioteca> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idBiblioteca")
    public ResponseEntity<Biblioteca> findById(@PathVariable Long idBiblioteca){
        Biblioteca obj= service.findById(idBiblioteca);
        return  ResponseEntity.ok().body(obj);
    }
}
