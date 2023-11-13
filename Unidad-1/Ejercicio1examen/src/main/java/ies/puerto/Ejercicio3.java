package ies.puerto;


/**
 * Clase que implementa un ordenamiento de burbuja
 * @author Shbarroso
 */
public class Ejercicio3 {

    public int[] burbuja(int[] array) {
        int tamanio = array.length;
        boolean intercambio = false;
        do {
            intercambio = false;
            for (int i = 1; i < tamanio-1; i++){
                if (array[i-1] > array[i]){
                    int temporal = array[i];
                    array[i] = array[i-1];
                    array[i-1] =temporal;
                    intercambio = true;
                }
            }

        }while (intercambio);
        return  array;
    }
}