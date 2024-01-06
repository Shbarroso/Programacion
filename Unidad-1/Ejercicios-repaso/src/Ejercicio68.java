import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que tome un número entero y un número decimal ingresados por el usuario,
 * los multiplique y muestre el resultado en una cadena junto con un mensaje.
 */

public class Ejercicio68 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        System.out.print("Ingrese un número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        double resultado = numeroEntero * numeroDecimal;

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}