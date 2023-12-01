package com.example.Clinica.DTOs;
import java.util.Date;

public class CrearTurnoDTO {

    private Date fecha;
    private Integer matriculaOdontologo;
    private Integer dniPaciente;
    private Long odontologoId;
    private Long pacienteId;

    public CrearTurnoDTO() {
    }

    public CrearTurnoDTO(Date fecha, Integer matriculaOdontologo, Integer dniPaciente) {
        this.fecha = fecha;
        this.matriculaOdontologo = matriculaOdontologo;
        this.dniPaciente = dniPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public Integer getMatriculaOdontologo() {
        return matriculaOdontologo;
    }

    public Integer getDniPaciente() {
        return dniPaciente;
    }

    public Long getOdontologoId() {
        return odontologoId;
    }

    public Long getPacienteId() {
        return pacienteId;
    }
}
