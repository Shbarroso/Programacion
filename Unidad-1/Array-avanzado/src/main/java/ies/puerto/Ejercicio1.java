package ies.puerto;

import java.util.Scanner;

/**
 * @author Shbarroso
 */
public class Ejercicio1 {
    public void pedirDatos() {
        float[] array = new float[5];
        Scanner scanner = new Scanner(System.in);
        int i= 0;
        float temporal;
        do{
            System.out.println("Introduce el valor "+(i+1));
            temporal = scanner.nextFloat();
            if((temporal > 0) && (temporal <= 10)) {
                array[i] = temporal;
                i++;
            }
        } while (i < array.length);


    }
    /**
     * Documentar el metodo
     *
     * @param array
     * @return
     */
    public float notaMedia(float[] array) {
        float media = 0;
        float suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        media = suma / array.length;
        return media;
    }

    /**
     * @param array
     */
    public void mostrarArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("" + array[i]);
            System.out.println(array[i]);
        }
    }

    public float maximoArray(float[] array) {
        float maximo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }

        }
        return maximo;
    }

    public float minimoArray(float[] array) {
        float minimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }
}