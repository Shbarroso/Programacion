import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que pida al usuario ingresar cinco notas y calcule el promedio utilizando un bucle for.
 */

public class Ejercicio77 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa la nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }

        double promedio = suma / 5;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}