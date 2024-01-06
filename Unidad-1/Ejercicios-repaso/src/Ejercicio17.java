import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que tome un número entero y un número decimal
 * ingresados por el usuario y muestre su suma, considerando conversiones necesarias.
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        double suma = numeroEntero + numeroDecimal;

        System.out.println("La suma es: " + suma);
    }
}