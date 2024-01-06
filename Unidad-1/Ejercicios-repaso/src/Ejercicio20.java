import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que declare dos variables booleanas, representando por ejemplo si está lloviendo
 * y si es de noche, y luego utilice operadores lógicos para determinar si se debe encender una lámpara.
 */

public class Ejercicio20 {

    public static void main(String[] args) {

        boolean estaLloviendo = true;
        boolean esDeNoche = false;

        if (estaLloviendo && esDeNoche) {
            System.out.println("Se debe encender la lámpara");
        } else {
            System.out.println("No se debe encender la lámpara");
        }
    }
}