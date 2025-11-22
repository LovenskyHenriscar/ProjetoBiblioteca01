package com.example.demo.Repositories;

import com.example.demo.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {
}
