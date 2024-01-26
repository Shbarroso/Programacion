package org.example;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
public Persona () {}
    public Persona(String nombre,int edad, int dni) {
        this.nombre = nombre;
        this.edad = dni;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public String suSaludo (){
    return "Hola eduardo, como estas";
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", edad: "+edad+", dni: "+dni;
    }
}