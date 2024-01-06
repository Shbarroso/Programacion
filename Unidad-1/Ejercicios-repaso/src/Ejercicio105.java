/**
 * @author Shbarroso
 * Crea una matriz de objetos Persona y llena la lista con varias instancias.
 * Luego, muestra la información de todas las personas.
 */
public class Ejercicio105 {
    private String nombre;
    private int edad;

    public Ejercicio105(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Ejercicio105[] ejercicios = new Ejercicio105[3];

        ejercicios[0] = new Ejercicio105("Juan", 25);
        ejercicios[1] = new Ejercicio105("María", 30);
        ejercicios[2] = new Ejercicio105("Pedro", 35);

        for (Ejercicio105 ejercicio : ejercicios) {
            System.out.println("Nombre: " + ejercicio.getNombre());
            System.out.println("Edad: " + ejercicio.getEdad());
            System.out.println();
        }
    }
}
