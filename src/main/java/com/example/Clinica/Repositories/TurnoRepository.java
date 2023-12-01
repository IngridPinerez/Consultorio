package com.example.Clinica.Repositories;

import com.example.Clinica.entities.Turno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends CrudRepository<Turno, Long> {
}
