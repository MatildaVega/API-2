package com.example.API.REST.G4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "SignosVitales")

public class SignoVital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String valor;
    private LocalDate fechaMedida;

    public SignoVital() {
    }

    public SignoVital(long id, String nombre, String valor, LocalDate fechaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fechaMedida = fechaMedida;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }

    @Override
    public String toString() {
        return "SignoVital{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", valor='" + valor + '\'' +
                ", fechaMedida=" + fechaMedida +
                '}';
    }
}
