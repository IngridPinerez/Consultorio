package com.example.Clinica.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Integer dni;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(length = 50)
    private String domicilio;


    public Paciente() {
    }

    public Paciente(Integer dni, String nombre, String apellido, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public Long getId() {
        return id;
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

    @OneToMany(mappedBy = "paciente")
    List<Turno> turno;

}
