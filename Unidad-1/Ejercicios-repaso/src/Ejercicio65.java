import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que tome un número entero ingresado por el usuario, lo convierta a un valor
 * double y muestre la raíz cuadrada de ese número.
 */

public class Ejercicio65 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        double numeroDouble = (double) numeroEntero;
        double raizCuadrada = Math.sqrt(numeroDouble);

        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);

    }
}