import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que solicita al usuario ingresar números positivos utilizando un bucle do- while.
 * El bucle debe continuar hasta que el usuario ingrese un número negativo.
 */

public class Ejercicio76 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número positivo: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                System.out.println("Número ingresado: " + numero);
            }
        } while (numero >= 0);
    }
}