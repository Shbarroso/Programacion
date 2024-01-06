import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que compare dos cadenas ingresadas por el usuario y determine si son iguales o diferentes.
 */

public class Ejercicio60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las cadenas: ");
        String cadena1 = scanner.nextLine();
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}