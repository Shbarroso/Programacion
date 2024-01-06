import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome dos cadenas ingresadas por el usuario y determine si tienen la misma longitud.
 */

public class Ejercicio48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la otra cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas no tienen la misma longitud.");
        }
    }
}