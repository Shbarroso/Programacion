import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que ordene un array de enteros en orden ascendente
 * y luego lo muestre. Solicita el tamaño de la matriz e introduce los valores.
 */

public class Ejercicio82 {

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

        Arrays.sort(array);

        System.out.println("El array ordenado en orden ascendente es: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + " ");
        }
    }
}