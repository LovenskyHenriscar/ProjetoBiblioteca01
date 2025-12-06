package com.example.demo.Resources;

import com.example.demo.Service.CategoriaService;
import com.example.demo.entities.Categoria;
import com.example.demo.entities.Editoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
    @Autowired
    private CategoriaService service;

    @Autowired
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idCategoria")
    public ResponseEntity<Categoria> findById(@PathVariable Long idCategoria){
        Categoria obj= service.findById(idCategoria);
        return  ResponseEntity.ok().body(obj);
    }
}
