import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que solicite al usuario su nombre y luego muestre
 * "¡Hola, [nombre]!", donde [nombre] es el nombre proporcionado por el usuario.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, "+ nombre + "!");
    }
}