package com.example.Clinica.DTOs;

public class CrearPacienteDTO {

    private Integer dni;
    private String nombre;
    private String apellido;
    private String domicilio;

    public CrearPacienteDTO() {
    }

    public CrearPacienteDTO(Integer dni, String nombre, String apellido, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

}
