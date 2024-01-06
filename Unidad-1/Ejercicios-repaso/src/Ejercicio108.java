import java.util.Arrays;
import java.util.Comparator;
/**
 * @author Shbarroso
 * Desarrolla un método para ordenar una matriz de objetos Persona por edad, de menor a mayor.
 */

public class Ejercicio108 {
    private String nombre;
    private int edad;

    public Ejercicio108(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public static void ordenarPorEdad(Ejercicio108[] ejercicios) {
        Arrays.sort(ejercicios, Comparator.comparingInt(Ejercicio108::getEdad));
    }

    public static void main(String[] args) {
        Ejercicio108[] ejercicios = new Ejercicio108[3];
        ejercicios[0] = new Ejercicio108("Juan", 25);
        ejercicios[1] = new Ejercicio108("María", 30);
        ejercicios[2] = new Ejercicio108("Pedro", 35);

        ordenarPorEdad(ejercicios);

        for (Ejercicio108 ejercicio : ejercicios) {
            System.out.println("Nombre: " + ejercicio.getNombre() + ", Edad: " + ejercicio.getEdad());
        }
    }
}
