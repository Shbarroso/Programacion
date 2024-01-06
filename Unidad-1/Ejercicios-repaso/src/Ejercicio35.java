import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome un carácter ingresado
 * por el usuario y determine si es una vocal o una consonante.
 */

public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");

        char caracter = scanner.next().charAt(0);

        if (esVocal(caracter)) {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado es una consonante.");
        }
    }

    public static boolean esVocal(char caracter) {
        caracter = Character.toLowerCase(caracter);
        return "aeiou".contains(String.valueOf(caracter));
    }
}