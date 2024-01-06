import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que incluya un bucle mientras se ejecuta infinitamente.
 * Asegúrese de proporcionar una condición de salida adecuada.
 */

public class Ejercicio80 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("El bucle se está ejecutando infinitamente.");
            System.out.print("Ingrese salir para detener el bucle: ");
            String entrada = sc.nextLine();

            if (entrada.equals("salir")) {
                ejecutar = false;
            }
        }
        System.out.println("El bucle ha sido detenido.");
    }
}