package com.example.demo.Service;

import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.CategoriaRepository;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;
    public List<Categoria> findAll() {return  repository.findAll();}

    public Categoria findById(Long  idCategoria )
    {
        Optional<Categoria > obj = repository.findById(idCategoria);
        return  obj.get();

    }

    public Categoria insert (Categoria obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idCategoria) { repository.deleteById( idCategoria);}
    public Categoria update (Long idCategoria , Categoria obj)
    {
        Categoria  entity = repository.getOne(idCategoria );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Categoria entity, Categoria obj)
    {
        entity.setNome(obj.getNome());

    }
}
