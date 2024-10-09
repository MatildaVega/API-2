package com.example.API.REST.G4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="Enfermedades")
public class Enfermedad {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String gradp;
    private Double probabilidadVivir;

    public Enfermedad() {
    }

    public Enfermedad(long id, String nombre, String sintomas, String clasificacion, String gradp, Double probabilidadVivir) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.gradp = gradp;
        this.probabilidadVivir = probabilidadVivir;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGradp() {
        return gradp;
    }

    public void setGradp(String gradp) {
        this.gradp = gradp;
    }

    public Double getProbabilidadVivir() {
        return probabilidadVivir;
    }

    public void setProbabilidadVivir(Double probabilidadVivir) {
        this.probabilidadVivir = probabilidadVivir;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", gradp='" + gradp + '\'' +
                ", probabilidadVivir=" + probabilidadVivir +
                '}';
    }
}
