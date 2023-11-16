package ies.puerto;

import java.util.Scanner;

/**
 * @author Shbarroso
 */
public class Ejercicio2 {

    public void pedirDatos() {
        float[] array = new float[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int temporal;
        boolean salir = false;
        do {
            System.out.println("Introduce el valor " + (i + 1));
            temporal = scanner.nextInt();
            if (temporal < 0) {
                salir = true;
            }else {
                array[i] = temporal;
                i++;
            }
        } while (i < array.length && !salir);
        mostrarArray(array, i);
    }

    public void mostrarArray(float[] array, int total) {
        for (int i = 0; i <= total; i++) {
            System.out.println(array[i]);
        }
    }

}