import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que declare una variable de tipo char y muestre su valor ASCII.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        char caracter = 'B';
        int valorAscii = (int) caracter;

        System.out.println("El valor ASCII de " + caracter + " es: " + valorAscii);
    }
}