package ies.puerto;

import javax.swing.plaf.PanelUI;

/**
 *
 * @author Shbarroso
 */
public class Persona {
    private String nombre;
    private int edad;
    private String email;
    private int telefono;

    /**
     * Constructor por defecto de la clase
     */
    public Persona() {}

    /**
     * Constructor con el parametro nombre
     * @param nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor de la clase con el nombre y la edad
     * @param nombre de la persona
     * @param edad de la persona
     */
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Constructor de la clase con nombre, edad y email.
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     */
    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Constructor de la clase con nombre, edad, email, telefono.
     * @param nombre de la persona
     * @param edad de la persona
     * @param email de la persona
     * @param telefono de la persona
     */
    public Persona (String nombre, int edad, String email, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    /**
     * Getters/Setters de la clase
     */
    public void setEdad( int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     public void imprimir() {
      System.out.println("Nombre:" +nombre);
      System.out.println("Edad:" +edad);
      System.out.println("email:" +email);
      System.out.println("telefono:" +telefono);
     }
     **/
    public String imprimir() {


        return "Nombre:" + nombre + "Edad:" + edad + "email:" + email + "telefono:" + telefono
    }

}