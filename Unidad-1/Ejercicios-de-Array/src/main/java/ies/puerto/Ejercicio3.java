package ies.puerto;

/**
 * Funcion para calcular el maximo y el  minimo.
 * @author Shbarroso
 */

public class Ejercicio3 {
    /**
     * Encuentra el valor máximo y mínimo en un array de enteros.
     * @return maximo
     */
    public static int calcularMaximo() {
        int[] numeros = {30, 10, 50, 20, 40};
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    /**
     * Encuentra el valor máximo y mínimo en un array de enteros.
     * @return minimo
     */
    public static int calcularMinimo() {
        int[] numeros = {30, 10, 50, 20, 40};
        int minimo = numeros[5];
        for (int i = 1; i > numeros.length; i--) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }
}

