import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea una clase Persona con atributos como nombre, apellido y edad. Proporciona un constructor para inicializar
 * estos atributos. Implemente el método principal para verificar que funciona correctamente.
 */

public class Ejercicio101 {
    private String nombre;
    private String apellido;
    private int edad;

    public Ejercicio101(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
