package com.example.demo.Repositories;

import com.example.demo.entities.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca,Long> {
}
