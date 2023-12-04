package com.example.Clinica.Services;

import com.example.Clinica.DTOs.CrearTurnoDTO;
import com.example.Clinica.Exceptions.ConsultorioApiException;
import com.example.Clinica.Repositories.OdontologoRepository;
import com.example.Clinica.Repositories.PacienteRepository;
import com.example.Clinica.Repositories.TurnoRepository;
import com.example.Clinica.entities.Odontologo;
import com.example.Clinica.entities.Paciente;
import com.example.Clinica.entities.Turno;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.StreamSupport;


@org.springframework.stereotype.Service
public class TurnoService {

    TurnoRepository turnoRepository;
    PacienteRepository pacienteRepository;
    OdontologoRepository odontologoRepository;

    @Autowired
    public TurnoService(TurnoRepository turnoRepository, PacienteRepository pacienteRepository, OdontologoRepository odontologoRepository) {
        this.turnoRepository = turnoRepository;
        this.pacienteRepository = pacienteRepository;
        this.odontologoRepository = odontologoRepository;
    }

    public Turno crear(CrearTurnoDTO dto){

        Odontologo odontologo = this.odontologoRepository.findById(dto.getOdontologoId()).orElseThrow(() -> new ConsultorioApiException("El odontologo no existe"));
        Paciente paciente = this.pacienteRepository.findById(dto.getPacienteId()).orElseThrow(() -> new ConsultorioApiException("El paciente no existe"));

        Turno nuevoTurno = new Turno(dto.getFecha(),odontologo,paciente);
        return this.turnoRepository.save(nuevoTurno);
    }

    public List<Turno> listar(){
        return StreamSupport.stream(this.turnoRepository.findAll().spliterator(), false).toList();
    }

}
