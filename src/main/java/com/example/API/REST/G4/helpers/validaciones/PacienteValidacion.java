package com.example.API.REST.G4.helpers.validaciones;

import com.example.API.REST.G4.modelos.Paciente;

import java.time.LocalDate;

public class PacienteValidacion {

   // inyecccion de dependencias
    //LLAMAR UNA CLASE DENTRO DE OTRA
    private Paciente paciente= new Paciente();

    //CREARUN METODO PARA CADA DATO QUE DEBO VALIDAR
    public Boolean validarNombre(){

        return true;

    }

    public Boolean validarFechaNacimiento(LocalDate fecha){

        if (fecha.getYear()>2024 || fecha.getYear()<1920) {
            return false;
        }else {
            return true;
        }
    }

    public Boolean validarCiudad(){

        return true;

    }

    public Boolean validarCorreo(){

        return true;

    }

    public Boolean validarTelefono(String telefono){

        if (telefono.length()!=10){
            return false;
        }else {
            return true;
        }

    }

    public Boolean validarGrupoIngresos(String grupoIngreso){
        if (grupoIngreso.toLowerCase().equals("A") || grupoIngreso.toUpperCase().equals("B") || grupoIngreso.toLowerCase().equals("C") ){
            return true;

        }else {
            return false;
        }

    }

    public Boolean validarFechaAfiliacion(LocalDate FechaAfiliacion) {
        if (fecha.getYear()) {

            return true;
        }

    }
}