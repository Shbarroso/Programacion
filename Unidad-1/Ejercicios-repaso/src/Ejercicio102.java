/**
 * @author Shbarroso
 * Agregue métodos en la clase Persona para establecer y obtener el nombre, apellido y
 * edad. (Gettes/Setters). Implemente el método principal para verificar que funciona correctamente.
 */

public class Ejercicio102 {
    private String nombre;
    private String apellido;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Ejercicio102 persona = new Ejercicio102();

        persona.setNombre("Juan");
        persona.setApellido("Pérez");
        persona.setEdad(25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
    }
}

