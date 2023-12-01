package com.example.Clinica.Controllers;

import com.example.Clinica.DTOs.CrearTurnoDTO;
import com.example.Clinica.Services.TurnoService;
import com.example.Clinica.entities.Turno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
