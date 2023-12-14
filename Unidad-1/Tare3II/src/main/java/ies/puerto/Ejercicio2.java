package ies.puerto;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio2 {
    private String nombre;
    private Date fechaNacimiento;

    public Ejercicio2 (){}

    public Ejercicio2(String nombre) {
        this.nombre = nombre;
    }

    public Ejercicio2(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public static void main(String[] args) {
        Calendar fechaActual = Calendar.getInstance();

        int año = fechaActual.get(Calendar.YEAR);
        int mes = fechaActual.get(Calendar.MONTH) + 1;
        int dia = fechaActual.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha actual: " + dia + "-" + mes + "-" + año);
    }
}
