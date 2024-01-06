import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome un número entero ingresado
 * por el usuario y lo convierta a una cadena, luego muestre la longitud de esa cadena.
 */

public class Ejercicio61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");

        int numero = scanner.nextInt();
        String cadena = String.valueOf(numero);
        int longitud = cadena.length();

        System.out.println("La longitud de la cadena es: " + longitud);
    }
}