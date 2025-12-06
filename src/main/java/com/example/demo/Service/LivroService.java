package com.example.demo.Service;

import com.example.demo.Repositories.AutorRepository;
import com.example.demo.Repositories.LivroRepository;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  LivroService {

    @Autowired
    private LivroRepository repository;
    public List<Livro> findAll() {return  repository.findAll();}

    public Livro findById(Long  idLivro)
    {
        Optional<Livro> obj = repository.findById(idLivro);
        return  obj.get();

    }
    public Livro insert ( Livro obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idLivro) { repository.deleteById(idLivro);}

    public Livro update (Long idLivro  , Livro  obj)
    {
        Livro   entity = repository.getOne(idLivro  );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Livro entity, Livro  obj)
    {
        entity.setQuantidadeExemplares(obj.getQuantidadeExemplares());

    }
}
