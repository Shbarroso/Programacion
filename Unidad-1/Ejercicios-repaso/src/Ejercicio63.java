import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que tome tu nombre y apellido ingresados por separado y muestre
 * tu nombre completo en una sola línea.
 */

public class Ejercicio63 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Tu nombre completo es: " + nombreCompleto);

    }
}