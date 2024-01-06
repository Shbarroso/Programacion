import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que determine si un número decimal ingresado por el
 * usuario es positivo, negativo o cero.
 */

public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el numero decimal: ");
        double decimal = scanner.nextInt();

        if (decimal > 0) {
            System.out.println("El numero es positivo");
        } else if (decimal < 0) {
            System.out.println(" El numero es negativo");
        }else {
            System.out.println("El numero es cero");
        }
    }
}