
import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que compare dos números enteros ingresados por el
 * usuario y muestre cuál es mayor o si son iguales.
 */

public class Ejercicio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el numero: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 <= numero2) {
            System.out.println("Es mayor");
        }else {
            System.out.println("Son iguales");
        }
    }
}