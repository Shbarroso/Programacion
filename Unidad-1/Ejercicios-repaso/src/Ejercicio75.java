import java.util.Scanner;

/**
 * @author Shbarroso
 * Haga un programa que utilice un bucle mientras para imprimir los números pares del 20 al 2 en orden descendente.
 */

public class Ejercicio75 {

    public static void main(String[] args) {
        int numero = 20;

        while (numero >= 2) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero -= 2;
        }
    }
}