package com.example.Clinica.Controllers;

import com.example.Clinica.DTOs.CrearTurnoDTO;
import com.example.Clinica.Services.TurnoService;
import com.example.Clinica.entities.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/consultorio/turno")
public class TurnoController {

    private TurnoService service;

    @Autowired
    public TurnoController(TurnoService service) {
        this.service = service;
    }

    @PostMapping()
    public Turno crearTurno(@RequestBody CrearTurnoDTO dto){
        return this.service.crear(dto);
    }

    @GetMapping
    public List<Turno> listTurnos(){
        return this.service.listar();
    }

}
