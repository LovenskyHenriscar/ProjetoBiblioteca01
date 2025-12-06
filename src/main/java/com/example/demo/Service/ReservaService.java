package com.example.demo.Service;

import com.example.demo.Repositories.ReservaRepository;
import com.example.demo.entities.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository repository;
    public List<Reserva> findAll() {return  repository.findAll();}

    public Reserva findById(Long idReserva)
    {
        Optional<Reserva> obj = repository.findById(idReserva);
        return  obj.get();

    }
    public Reserva insert (Reserva obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idReserva) { repository.deleteById(idReserva);}

    public Reserva update (Long idReserva , Reserva obj)
    {
        Reserva  entity = repository.getOne(idReserva );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Reserva entity, Reserva obj)
    {
        entity.setDataReserva(obj.getDataReserva());

    }
}
