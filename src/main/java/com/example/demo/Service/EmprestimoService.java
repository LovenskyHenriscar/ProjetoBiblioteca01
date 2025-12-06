package com.example.demo.Service;

import com.example.demo.Repositories.EmprestimoRepository;
import com.example.demo.entities.Emprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;
    public List<Emprestimo> findAll() {return  repository.findAll();}

    public Emprestimo findById(Long  idEmprestimo )
    {
        Optional< Emprestimo > obj = repository.findById(idEmprestimo );
        return  obj.get();
    }
      public Emprestimo insert (Emprestimo  obj)
    {
        return repository.save(obj);
    }
    public void delete (Long idEmprestimo) { repository.deleteById( idEmprestimo);}

    public Emprestimo update (Long idEmprestimo , Emprestimo obj)
    {
        Emprestimo  entity = repository.getOne(idEmprestimo );
        updateData (entity, obj);
        return repository.save(entity);

    }

    private void updateData (Emprestimo entity, Emprestimo obj)
    {
      entity.setDataEmprestimo(obj.getDataEmprestimo());

    }
}
