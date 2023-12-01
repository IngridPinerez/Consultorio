package com.example.Clinica.Repositories;

import com.example.Clinica.entities.Odontologo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends CrudRepository<Odontologo, Long> {

    @Query
    public Odontologo findByMatricula(Integer matricula);

}
