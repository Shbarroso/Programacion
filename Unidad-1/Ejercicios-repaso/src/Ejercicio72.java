import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que solicita al usuario ingresar cinco números y calcula el
 * producto de esos números utilizando un bucle for.
 */

public class Ejercicio72 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int producto = 1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            producto *= numero;
        }

        System.out.println("El producto de los números ingresados es: " + producto);

    }
}