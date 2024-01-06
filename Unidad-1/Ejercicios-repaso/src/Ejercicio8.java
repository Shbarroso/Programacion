import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que solicite al usuario una cantidad en euros
 * y muestre su equivalente en dólares solicitando el valor cambio.
 */

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        System.out.print("Introduce el valor de cambio: ");
        double cambio = scanner.nextDouble();

        double dolares = euros * cambio;

        System.out.println("El equivalente en dólares es: " + dolares);
    }
}