import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome un número ingresado como cadena y lo convierta
 * a un valor entero, luego multiplícalo por 2 y muestra el resultado
 */

public class Ejercicio64 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número como cadena: ");
        String numeroCadena = scanner.nextLine();

        int numeroEntero = Integer.parseInt(numeroCadena);
        int resultado = numeroEntero * 2;

        System.out.println("El resultado de la multiplicación es: " + resultado);

    }
}