import java.util.Scanner;

/**
 * @author Shbarroso
 * Haz un programa que utilice una constante para representar el valor máximo permitido para la temperatura.
 * Luego, pide al usuario ingresar una temperatura y determina si está dentro del rango permitido.
 */

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempereturamaxima = 100.0;
        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        if (temperatura <= tempereturamaxima) {
            System.out.println("La temperatura está dentro del rango permitido.");
        } else {
            System.out.println("La temperatura excede el rango permitido.");
        }
    }
}