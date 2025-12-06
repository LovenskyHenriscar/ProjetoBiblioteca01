package com.example.demo.Service;

import com.example.demo.Repositories.MultaRepository;
import com.example.demo.entities.Multa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultaService {
    @Autowired
    private MultaRepository repository;
    public List<Multa> findAll() {return  repository.findAll();}

    public Multa findById(Long idMulta)
    {
        Optional<Multa> obj = repository.findById(idMulta);
        return  obj.get();
    }

    public Multa insert (Multa  obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idMulta) { repository.deleteById(idMulta);}


    public Multa update (Long idMulta , Multa obj)
    {
        Multa  entity = repository.getOne(idMulta );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Multa entity, Multa obj)
    {
        entity.setMotivo(obj.getMotivo());

    }
}
