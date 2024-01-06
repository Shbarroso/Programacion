import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que sume todos los elementos de un array de enteros y muestre
 * el resultado. Solicita el tamaño de la matriz, e introduce los valores, para ejecutar la suma.
 */

public class Ejercicio81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = sc.nextInt();

        int[] array = new int[tamaño];

        System.out.println("Ingrese los valores del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            suma += array[i];
        }

        System.out.println("La suma de los elementos del array es: " + suma);
    }
}