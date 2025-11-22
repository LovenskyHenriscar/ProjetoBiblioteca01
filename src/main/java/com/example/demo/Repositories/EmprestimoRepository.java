package com.example.demo.Repositories;

import com.example.demo.entities.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo,Long> {
}
