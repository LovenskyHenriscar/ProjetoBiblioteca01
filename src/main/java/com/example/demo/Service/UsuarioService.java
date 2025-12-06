package com.example.demo.Service;

import com.example.demo.Repositories.UsuarioRepository;
import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;
    public List<Usuario> findAll() {return  repository.findAll();}

    public Usuario findById(Long  idUsuario)
    {
        Optional<Usuario> obj = repository.findById(idUsuario);
        return obj.get();
    }
    public Usuario insert (Usuario obj)
    {
        return repository.save(obj);
    }

    public void delete (Long idUsuario) { repository.deleteById(idUsuario);}

    public Usuario update (Long idUsuario  ,  Usuario  obj)
    {
        Usuario  entity = repository.getOne(idUsuario  );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData ( Usuario  entity,  Usuario  obj)
    {
        entity.setNome(obj.getNome());

    }
}
