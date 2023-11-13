package ies.puerto;

/**
 * @author Shbarroso
 */
public class Ejercicio1 {
    public int busquedaBinaria(int[] array, int valor) {
        int posicion = 0;
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
            if (array[posicion] == valor) {
                return posicion;
            } else if (array[posicion] < valor) {
                inicio = array[posicion] + 1;
            } else {
                fin = posicion - 1;
            }
        }
        return -1;
    }
}