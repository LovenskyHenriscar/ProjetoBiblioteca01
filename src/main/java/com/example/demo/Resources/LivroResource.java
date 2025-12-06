package com.example.demo.Resources;


import com.example.demo.Service.AutorService;
import com.example.demo.Service.LivroService;
import com.example.demo.entities.Livro;
import com.example.demo.entities.Multa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/livros")
public class LivroResource {
    @Autowired
    private LivroService service;

    @GetMapping
    public ResponseEntity<List<Livro>> findAll(){
        List<Livro> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idLivro")
    public ResponseEntity<Livro> findById(@PathVariable Long idLivro){
        Livro obj= service.findById(idLivro);
        return  ResponseEntity.ok().body(obj);
    }
}
