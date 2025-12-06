package com.example.demo.Service;

import com.example.demo.Repositories.EditoriaRepository;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EditoriaService {
    @Autowired
    private EditoriaRepository repository;

    public List<Editoria> findAll() {
        return repository.findAll();
    }

    public Editoria findById(Long idEditoria) {
        Optional<Editoria> obj = repository.findById(idEditoria);
        return obj.get();
    }

    public Editoria insert(Editoria obj) {
        return repository.save(obj);
    }

    public void delete(Long idEditoria) {
        repository.deleteById(idEditoria);
    }


    public Editoria update (Long idEditoria , Editoria obj)
    {
        Editoria  entity = repository.getOne(idEditoria );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Editoria entity, Editoria obj)
    {
        entity.setNome(obj.getNome());

    }
}