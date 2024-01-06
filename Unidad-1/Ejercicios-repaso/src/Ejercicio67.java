import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome un número decimal, lo convierta a una cadena
 * y muestre cuántos dígitos tiene después del punto decimal.
 */

public class Ejercicio67 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        String numeroCadena = String.valueOf(numeroDecimal);
        int punto1 = numeroCadena.indexOf(".");
        int punto2 = numeroCadena.length() - punto1 - 1;

        System.out.println("El número tiene " + punto2 + " dígitos después del punto decimal.");

    }
}