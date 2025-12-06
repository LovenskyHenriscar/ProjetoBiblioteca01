package com.example.demo.Service;

import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.BibliotecaRepository;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {
    @Autowired
    private BibliotecaRepository repository;
    public List<Biblioteca> findAll() {return  repository.findAll();}

    public Biblioteca findById(Long  idBiblioteca  )
    {
        Optional< Biblioteca > obj = repository.findById(idBiblioteca  );
        return  obj.get();
    }

    public Biblioteca insert  (Biblioteca obj)
    {
        return repository.save(obj);
    }

    public void delete (Long idBiblioteca) { repository.deleteById(idBiblioteca);}


    public Biblioteca update (Long idBiblioteca , Biblioteca  obj)
    {
        Biblioteca  entity = repository.getOne(idBiblioteca );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Biblioteca entity, Biblioteca  obj)
    {
        entity.setNome(obj.getNome());

    }
}
