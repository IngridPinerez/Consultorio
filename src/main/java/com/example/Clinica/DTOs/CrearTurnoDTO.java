package com.example.Clinica.DTOs;
import java.util.Date;

public class CrearTurnoDTO {

    private Date fecha;
    private Long odontologoId;
    private Long pacienteId;

    public CrearTurnoDTO() {
    }

    public CrearTurnoDTO(Date fecha, Long odontologoId, Long pacienteId) {
        this.fecha = fecha;
        this.odontologoId = odontologoId;
        this.pacienteId = pacienteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public Long getOdontologoId() {
        return odontologoId;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

}
