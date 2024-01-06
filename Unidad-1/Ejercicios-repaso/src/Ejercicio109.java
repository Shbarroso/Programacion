import java.util.ArrayList;
import java.util.List;

/**
 * @author Shbarroso
 * Escribe un método para recibir un nombre como parámetro y devuelva una lista
 * de todas las personas con ese nombre.
 */

 public class Ejercicio109 {
        private String nombre;
        private int edad;

    public Ejercicio109(String nombre, int edad) {
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

    public static List<Ejercicio108> obtenerPersonasPorNombre(List<Ejercicio108> personas, String nombre) {
            List<Ejercicio108> personasConNombre = new ArrayList<>();

            for (Ejercicio108 persona : personas) {
                if (persona.getNombre().equals(nombre)) {
                    personasConNombre.add(persona);
                }
            }

            return personasConNombre;
    }

    public static void main(String[] args) {
            List<Ejercicio108> personas = new ArrayList<>();
            personas.add(new Ejercicio108("Juan", 25));
            personas.add(new Ejercicio108("Juan", 30));
            personas.add(new Ejercicio108("Juan", 35));
            personas.add(new Ejercicio108("Juan", 40));

            List<Ejercicio108> personasConNombreJuan = obtenerPersonasPorNombre(personas, "Juan");

            for (Ejercicio108 persona : personasConNombreJuan) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
    }
}
