package com.example.demo.Repositories;

import com.example.demo.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}
