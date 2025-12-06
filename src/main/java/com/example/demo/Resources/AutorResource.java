package com.example.demo.Resources;

import com.example.demo.Service.AutorService;
import com.example.demo.entities.Autor;
import com.example.demo.entities.Biblioteca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/autores")
public class AutorResource {
    @Autowired
    private AutorService service;

    @Autowired
    public ResponseEntity<List<Autor>> findAll(){
        List<Autor> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }
    @GetMapping(value ="/idAutor")
    public ResponseEntity<Autor> findById(@PathVariable Long idAutor){
        Autor obj= service.findById(idAutor);
        return  ResponseEntity.ok().body(obj);
    }
}
