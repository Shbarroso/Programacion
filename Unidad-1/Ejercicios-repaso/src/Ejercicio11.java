import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que declare dos variables de tipo entero
 * e imprima su suma, resta, multiplicación y división.
 */

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el numero: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int division = numero1 / numero2;
        int multiplicacion = numero1 * numero2;

        System.out.println(" La suma es: "+ suma);
        System.out.println(" La resta es: "+ resta);
        System.out.println(" La division es: " +division);
        System.out.println("La multiplicación es: " + multiplicacion);
    }
}