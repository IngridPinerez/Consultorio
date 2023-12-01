package com.example.Clinica.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table
public class Odontologo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(unique = true, nullable = false)
    private Integer matricula;

    public Odontologo() {
    }

    public Odontologo(String nombre, String apellido, Integer matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    public Long getId() {
        return id;
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

    @OneToMany(mappedBy = "odontologo")
    List<Turno> turno;

}
