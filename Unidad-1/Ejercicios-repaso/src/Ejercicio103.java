/**
 * @author Shbarroso
 * Desarrolla un método en la clase Persona para mostrar toda la información de una persona
 * (nombre, apellido y edad). Implemente el método principal para verificar que funciona correctamente.
 */

public class Ejercicio103 {
        private String nombre;
        private String apellido;
        private int edad;

        public Ejercicio103(String nombre, String apellido, int edad) {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Edad: " + edad);
        }

        public static void main(String[] args) {
            Ejercicio103 persona = new Ejercicio103("Juan", "Pérez", 25);
            persona.mostrarInformacion();
        }
}

