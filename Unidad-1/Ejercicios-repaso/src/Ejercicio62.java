import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que tome dos números enteros ingresados por el usuario, realice la
 * suma y muestre el resultado.
 */

public class Ejercicio62 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el otro numero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resultado = suma;
        System.out.println(" El resultado es: " +resultado);

    }
}