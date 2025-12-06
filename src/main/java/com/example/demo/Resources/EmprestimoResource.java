package com.example.demo.Resources;


import com.example.demo.Service.EmprestimoService;
import com.example.demo.Service.EnderecoService;
import com.example.demo.entities.Emprestimo;
import com.example.demo.entities.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/emprestimos")
public class EmprestimoResource {
    @Autowired
    private EmprestimoService service;

    @Autowired
    public ResponseEntity<List<Emprestimo>> findAll(){
        List<Emprestimo> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }
    @GetMapping(value ="/idEmprestimo")
    public ResponseEntity<Emprestimo> findById(@PathVariable Long idEmprestimo){
        Emprestimo obj= service.findById(idEmprestimo);
        return  ResponseEntity.ok().body(obj);
    }
}
