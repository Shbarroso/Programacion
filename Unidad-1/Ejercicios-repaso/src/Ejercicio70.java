import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que pida al usuario ingresar números con un bucle mientras
 * y calcula la suma de esos números. Termina el bucle cuando la suma alcance o supere 100.
 */

public class Ejercicio70 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (suma < 100) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            suma += numero;
        }

        System.out.println("La suma ha alcanzado o superado 100.");
        System.out.println("La suma total es: " + suma);

    }
}