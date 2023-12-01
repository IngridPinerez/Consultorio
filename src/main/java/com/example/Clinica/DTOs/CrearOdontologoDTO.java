package com.example.Clinica.DTOs;

public class CrearOdontologoDTO {

    private String nombre;
    private String apellido;
    private Integer matricula;

    public CrearOdontologoDTO() {
    }

    public CrearOdontologoDTO(String nombre, String apellido, Integer matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }

}
