import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que solicite al usuario un número
 * (puede ser entero o decimal) y determine si es divisible por 5.
 */

public class Ejercicio37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextInt();

        if ( numero % 5 == 0) {
            System.out.println("El numero es divisible por 5.");
        }else {
            System.out.println("El numero no es divisible por 5.");
        }
    }
}