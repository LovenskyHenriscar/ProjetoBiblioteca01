package com.example.demo.Resources;


import com.example.demo.Service.AutorService;
import com.example.demo.Service.FuncionarioService;
import com.example.demo.entities.Funcionario;
import com.example.demo.entities.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/funcionarios")
public class FuncionarioResource {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        List<Funcionario> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idFuncionario")
    public ResponseEntity<Funcionario> findById(@PathVariable Long idFuncionario){
        Funcionario obj= service.findById(idFuncionario);
        return  ResponseEntity.ok().body(obj);
    }
}
