import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome una cadena ingresada por el usuario y cuente
 * cuantas vocales (a, e, i, o, u) contiene. Utilice un bucle mientras.
 */

public class Ejercicio73 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        int contadorVocales = 0;
        int i = 0;

        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
            i++;
        }
        System.out.println("La cadena ingresada contiene " + contadorVocales + " vocales.");
    }
}