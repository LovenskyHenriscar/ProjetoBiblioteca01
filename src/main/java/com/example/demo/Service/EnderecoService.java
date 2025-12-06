package com.example.demo.Service;

import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.EnderecoRepository;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;
    public List<Endereco> findAll() {return  repository.findAll();}
    public Endereco findById(Long  idEndereco )
    {
        Optional< Endereco > obj = repository.findById(idEndereco );
        return  obj.get();
    }
    public Endereco insert (Endereco  obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idEndereco) { repository.deleteById(idEndereco);}

    public Endereco update (Long idEndereco , Endereco obj)
    {
        Endereco  entity = repository.getOne(idEndereco );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Endereco entity, Endereco obj)
    {
        entity.setBairro(obj.getCep());

    }
}
