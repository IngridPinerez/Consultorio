package com.example.Clinica.entities;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private Date fecha;

    @Column
    private Long odontolog;

    @Column
    private Long pacient;

    public Turno() {
    }

    public Turno(Date fecha, Long odontolog, Long pacient) {
        this.fecha = fecha;
        this.odontolog = odontolog;
        this.pacient = pacient;
    }

    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Long getOdontologoId() {
        return odontolog;
    }

    public Long getPacienteId() {
        return pacient;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "odontologo_id", referencedColumnName = "id")
    Odontologo odontologo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    Paciente paciente;

}
