import java.util.Scanner;

/**
 * @author Shbarroso
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int digito;

        while (numero != 0) {
            digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}