/**
 * @author Shbarroso
 * Agregue un método en la clase Persona para actualizar la edad de una persona
 * y muestre un mensaje indicando si es mayor de edad o no (por ejemplo, si tiene 18 años o más).
 */

public class Ejercicio107 {
    private String nombre;
    private int edad;

    public Ejercicio107(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Ejercicio107() {

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarEdad(int nuevaEdad) {
        edad = nuevaEdad;
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }

    public static void main(String[] args) {
        Ejercicio107 persona = new Ejercicio107();
        persona.setNombre("Juan");
        persona.setEdad(21);

        persona.actualizarEdad(25);
    }
}
