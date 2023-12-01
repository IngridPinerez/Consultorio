package com.example.Clinica.entities;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 16, nullable = false)
    private Date fecha;

    @Column
    private Integer matriculaOdontologo;

    @Column
    private Integer dniPaciente;

    public Turno() {
    }

    public Turno(Date fecha, Integer matriculaOdontologo, Integer dniPaciente) {
        this.fecha = fecha;
        this.matriculaOdontologo = matriculaOdontologo;
        this.dniPaciente = dniPaciente;
    }

    public Long getId() {
        return id;
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

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @ManyToOne()
    Odontologo odontologo;

    @ManyToOne()
    Paciente paciente;

}
