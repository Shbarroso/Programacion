package ies.puero.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    String dni;
    String nombre;
    String apellido1;
    String getApellido2;
    List<Double> calificaciones;

    public Persona(String dni, String nombre, String apellido1, String getApellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.getApellido2 = getApellido2;
        calificaciones = new ArrayList<>();
    }

    public Persona(String dni, String nombre, String apellido1, String getApellido2, List<Double> calificaciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.getApellido2 = getApellido2;
        this.calificaciones = calificaciones;
    }

    public Double media() {
        Double resultado = 0d;
        Double suma = 0d;
        for (Double nota:calificaciones) {
            suma+=nota;
        }
        resultado = suma/calificaciones.size();
        return resultado;
    }

    @Override
    public String toString() {
        return "{dni:"+dni+", nombre: "+nombre+", apellido1:"+apellido1+", apellido2: "+getApellido2+"}" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
