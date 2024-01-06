import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que utiliza un bucle para imprimir un triángulo de asteriscos,
 * donde la base del triángulo es ingresada por el usuario.
 */

public class Ejercicio74 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del triángulo: ");
        int base = scanner.nextInt();

        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}