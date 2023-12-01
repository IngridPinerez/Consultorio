package com.example.Clinica.Services;

import com.example.Clinica.DTOs.CrearPacienteDTO;
import com.example.Clinica.Exceptions.ConsultorioApiException;
import com.example.Clinica.Repositories.PacienteRepository;
import com.example.Clinica.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PacienteService {

    PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente crear(CrearPacienteDTO dto){

        Paciente existe = this.pacienteRepository.findByDni(dto.getDni());
        if(existe != null){
            throw new ConsultorioApiException("El paciente ya existe", HttpStatusCode.valueOf(400));
        }

        Paciente nuevoPaciente = new Paciente(dto.getDni(),dto.getNombre(),dto.getApellido(),dto.getDomicilio());
        nuevoPaciente = this.pacienteRepository.save(nuevoPaciente);

        return nuevoPaciente;
    }

    public List<Paciente> listar(){
        return StreamSupport.stream(this.pacienteRepository.findAll().spliterator(), false).toList();
    }

    public Paciente eliminar(Long id) {

        if (!this.pacienteRepository.existsById(id)) {
            throw new ConsultorioApiException("No existe un paciente con el id " + id, HttpStatusCode.valueOf(400));
        }
        Paciente paciente = this.pacienteRepository.findById(id).get();
        this.pacienteRepository.deleteById(id);

        return paciente;
    }

}
