package com.example.Clinica.Repositories;

import com.example.Clinica.entities.Odontologo;
import com.example.Clinica.entities.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {

    @Query
    public Paciente findByDni(Integer dni);

}
