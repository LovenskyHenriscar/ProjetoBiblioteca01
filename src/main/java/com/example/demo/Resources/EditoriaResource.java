package com.example.demo.Resources;

import com.example.demo.Service.EditoriaService;
import com.example.demo.entities.Editoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/editorias")
public class EditoriaResource {
    @Autowired
    private EditoriaService service;

    @Autowired
    public ResponseEntity<List<Editoria>> findAll(){
        List<Editoria> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }
    @GetMapping(value ="/idEditoria")
    public ResponseEntity<Editoria> findById(@PathVariable Long idEditoria){
        Editoria obj= service.findById(idEditoria);
        return  ResponseEntity.ok().body(obj);
    }
}
