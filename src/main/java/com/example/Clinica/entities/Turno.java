package com.example.Clinica.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private Date fecha;

    @ManyToOne()
    Odontologo odontologo;

    @ManyToOne()
    Paciente paciente;

    public Turno() {
    }

    public Turno(Date fecha, Odontologo odontologo, Paciente paciente) {
        this.fecha = fecha;
        this.odontologo = odontologo;
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

}
