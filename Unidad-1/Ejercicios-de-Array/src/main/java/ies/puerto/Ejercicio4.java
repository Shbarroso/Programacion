package ies.puerto;

/**
 * Funcion para calcular un par
 * @author Shbarroso
 */

public class Ejercicio4 {
    /**
     * Imprime los números pares de un array de enteros.
     * @return pares
     */
    public static int calcularPares() {
        int[] numeros ={1, 2, 3, 4, 5};
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}
