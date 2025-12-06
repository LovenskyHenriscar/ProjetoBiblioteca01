package com.example.demo.Repositories;

import com.example.demo.entities.Editoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoriaRepository extends JpaRepository<Editoria, Long> {

}
