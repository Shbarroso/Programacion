import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que tome un número entero ingresado por el usuario y cuente cuántos dígitos tiene utilizando un bucle for.
 */

public class Ejercicio79 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int contador = 0;
        for (int i = numero; i != 0; i /= 10) {
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");
    }
}