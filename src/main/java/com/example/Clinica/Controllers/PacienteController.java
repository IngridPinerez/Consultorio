package com.example.Clinica.Controllers;

import com.example.Clinica.DTOs.CrearPacienteDTO;
import com.example.Clinica.Services.PacienteService;
import com.example.Clinica.entities.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/consultorio/paciente")
public class PacienteController {

    private PacienteService service;

    @Autowired
    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping()
    public Paciente crearPaciente(@RequestBody CrearPacienteDTO dto){
        return this.service.crear(dto);
    }

    @GetMapping
    public List<Paciente> listPacientes(){
        return this.service.listar();
    }

    @DeleteMapping("/{id}")
    public Paciente eliminarPaciente(@PathVariable("id") Long id){
        return this.service.eliminar(id);
    }

}
