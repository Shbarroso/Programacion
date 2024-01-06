/**
 * @author Shbarroso
 * Haz un método que calcule el promedio de edad de un grupo de personas.
 */

public class Ejercicio106 {
    private String nombre;
    private int edad;

    public Ejercicio106(String nombre, int edad) {
        this.nombre = nombre;
    }

    public Ejercicio106(int edad) {
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

    public static double calcularPromedioEdad(Ejercicio106[] ejercicios) {
        int sumaEdades = 0;
        for (Ejercicio106 ejercicio : ejercicios) {
            sumaEdades += ejercicio.getEdad();
        }
        return (double) sumaEdades / ejercicios.length;
    }


    public static void main(String[] args) {

        Ejercicio106[] ejercicios = new Ejercicio106[3];
        ejercicios[0] = new Ejercicio106("Juan", 25);
        ejercicios[1] = new Ejercicio106("María", 30);
        ejercicios[2] = new Ejercicio106("Pedro", 35);

        double promedioEdad = Ejercicio106.calcularPromedioEdad(ejercicios);

        System.out.println("El promedio de edad del grupo de Ejercicio106 es: " + promedioEdad);
    }
}
