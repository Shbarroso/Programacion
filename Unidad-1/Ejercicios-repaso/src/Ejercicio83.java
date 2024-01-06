import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que busque un número específico en un array y muestre su
 * posición si se encuentra, o un mensaje indicando que no se encontró.
 */

public class Ejercicio83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numeroBuscado = sc.nextInt();
        int[] array = {2, 4, 6, 8, 10};
        int posicion = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + posicion);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encontró en el array");
        }
    }
}