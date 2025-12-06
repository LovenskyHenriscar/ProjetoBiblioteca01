package com.example.demo.Service;

import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.FuncionarioRepository;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;
    public List<Funcionario> findAll() {return  repository.findAll();}
    public Funcionario findById(Long idFuncionario)
    {
        Optional<Funcionario> obj = repository.findById(idFuncionario);
        return  obj.get();
    }

    public Funcionario insert (Funcionario  obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idFuncionario) { repository.deleteById(idFuncionario);}

    public Funcionario update (Long idFuncionario ,  Funcionario obj)
    {
        Funcionario  entity = repository.getOne(idFuncionario);
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData ( Funcionario entity,  Funcionario obj)
    {
        entity.setLivro(obj.getStatus());

    }
}
