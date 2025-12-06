package com.example.demo.Resources;


import com.example.demo.Service.AutorService;
import com.example.demo.Service.UsuarioService;
import com.example.demo.entities.Reserva;
import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value ="/usuarios")
public class UsuarioResource {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> list = service.findAll();
        return  ResponseEntity.ok().body(list);
    }

    @GetMapping(value ="/idUsuario")
    public ResponseEntity<Usuario> findById(@PathVariable Long idUsuario){
        Usuario obj= service.findById(idUsuario);
        return  ResponseEntity.ok().body(obj);
    }
}
