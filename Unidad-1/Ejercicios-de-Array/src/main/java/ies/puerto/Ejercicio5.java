package ies.puerto;


import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Dado un valor específico, encuentra su posición en el array o indica si no está presente.
     * @param args
     */
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = sc.nextInt();
    }



    public static int encontarPosicion(int[] array, int valor) {
        for ( int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}