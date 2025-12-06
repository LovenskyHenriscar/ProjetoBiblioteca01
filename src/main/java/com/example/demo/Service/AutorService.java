package com.example.demo.Service;

import com.example.demo.Repositories.AutorRepository;
import com.example.demo.entities.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;
    public List<Autor> findAll() {return  repository.findAll();}

    public Autor findById(Long  idAutor )
    {
        Optional<Autor> obj = repository.findById(idAutor );
        return  obj.get();
    }

    public Autor insert  (Autor obj)
    {
        return repository.save(obj);
    }

    public void delete (Long idAutor) { repository.deleteById(idAutor);}

    public Autor update (Long idAutor, Autor obj)
    {
        Autor entity = repository.getOne(idAutor);
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Autor entity, Autor obj)
    {
        entity.setNome(obj.getNome());
        entity.setNacionalidade(obj.getNacionalidade());
    }
}
