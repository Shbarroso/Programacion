import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que cuente cuantas veces aparece un número específico en un array de enteros.
 */

public class Ejercicio85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = sc.nextInt();
        int[] array = new int[tamano];

        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int numero = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < tamano; i++) {
            if (array[i] == numero) {
                contador++;
            }
        }

        System.out.println("El número " + numero + " aparece " + contador + " veces en el array.");
    }
}