package com.example.demo.Repositories;

import com.example.demo.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Long> {
}
