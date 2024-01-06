import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que pida al usuario dos números y luego muestre los dos números y su suma.
 */

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("El primer número ingresado es: " + numero1);
        System.out.println("El segundo número ingresado es: " + numero2);
        System.out.println("La suma de los dos números es: " + suma);
    }
}