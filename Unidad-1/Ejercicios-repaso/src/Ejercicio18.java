import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que declare una variable double y otra int,
 * luego realiza una conversión explícita de double a int y muestre el resultado.
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        double numero1 = 2.33333;
        int numero2 = (int) numero1;

        System.out.println("El número double es: " + numero1);
        System.out.println("El número int después de la conversión es: " + numero2);

    }
}