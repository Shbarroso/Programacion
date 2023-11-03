package ies.puerto;

/**
 * Clase que calcula suma
 * @author Shbarroso
 *
 */

public class Ejercicio1 {
    /**
     * Funcion para calcular una suma
     * @return suma
     */
    public static int calcularSuma() {
            int[] array = {1, 2, 3, 4, 5};
            array = new int[5];
            int suma = 0;

            for (int i = 0; i < array.length; i++) {
                suma += array[i];
                System.out.println("La suma de los elementos es: " + suma);
            }
            return suma;
    }

}