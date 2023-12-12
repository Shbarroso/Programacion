import java.util.Scanner;

/**
 * @author Shbarroso
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        String binario = Integer.toBinaryString(numero);

        System.out.println("El número " + numero + " en binario es: " + binario);
    }
}
