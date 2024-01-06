import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que utilice una variable booleana para
 * determinar si un número ingresado por el usuario es par o impar.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduce un numero: ");
        int numero = scanner.nextInt();

        boolean esPar =numero % 2 == 0;
        if (esPar) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero no es par");
        }
    }
}