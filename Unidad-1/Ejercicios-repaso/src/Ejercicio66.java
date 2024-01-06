import java.util.Scanner;

/**
 * @author Shbarroso
 * Haz un programa que tome una frase y una palabra ingresada por el usuario,
 * luego determine si la palabra está contenida en la frase.
 */

public class Ejercicio66 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        boolean contienePalabra = frase.contains(palabra);

        if (contienePalabra) {
            System.out.println("La palabra está contenida en la frase.");
        } else {
            System.out.println("La palabra no está contenida en la frase.");
        }



    }
}