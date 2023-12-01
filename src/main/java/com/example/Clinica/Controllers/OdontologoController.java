package com.example.Clinica.Controllers;

import com.example.Clinica.DTOs.CrearOdontologoDTO;
import com.example.Clinica.Services.OdontologoService;
import com.example.Clinica.entities.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/consultorio/odontologo")
public class OdontologoController {

    private OdontologoService service;

    @Autowired
    public OdontologoController(OdontologoService service) {
        this.service = service;
    }

    @PostMapping()
    public Odontologo crearOdontologo(@RequestBody CrearOdontologoDTO dto){
        return this.service.crear(dto);
    }

    @GetMapping
    public List<Odontologo> listOdontologos(){
        return this.service.listar();
    }

    @DeleteMapping("/{id}")
    public Odontologo eliminarOdontologo(@PathVariable("id") Long id){
        return this.service.eliminar(id);
    }

}
