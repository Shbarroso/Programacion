import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que tome una cadena ingresada por el usuario
 * y verifique si contiene la letra 'a' y muestra un mensaje adecuado.
 */

public class Ejercicio43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");

        String cadena = scanner.nextLine();
        if (cadena.contains("a")) {
            System.out.println("La cadena ingresada contiene la letra 'a'.");
        } else {
            System.out.println("La cadena ingresada no contiene la letra 'a'.");
        }

    }
}