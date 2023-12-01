package com.example.Clinica.Services;

import com.example.Clinica.DTOs.CrearTurnoDTO;
import com.example.Clinica.Repositories.OdontologoRepository;
import com.example.Clinica.Repositories.PacienteRepository;
import com.example.Clinica.Repositories.TurnoRepository;
import com.example.Clinica.entities.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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

        Turno nuevoTurno = new Turno(dto.getFecha(),dto.getMatriculaOdontologo(),dto.getDniPaciente());
        nuevoTurno = this.turnoRepository.save(nuevoTurno);

        return nuevoTurno;
    }

}
