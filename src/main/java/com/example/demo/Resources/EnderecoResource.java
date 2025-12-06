package com.example.demo.Resources;


import com.example.demo.Service.AutorService;
import com.example.demo.Service.EnderecoService;
import com.example.demo.entities.Endereco;
import com.example.demo.entities.Funcionario;
import com.example.demo.entities.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/enderecos")
public class EnderecoResource {
    @Autowired
    private EnderecoService service;

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll(){
        List<Endereco> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }


    @GetMapping(value ="/idEndereco")
    public ResponseEntity<Endereco> findById(@PathVariable Long idEndereco){
        Endereco obj= service.findById(idEndereco);
        return  ResponseEntity.ok().body(obj);
    }

}
