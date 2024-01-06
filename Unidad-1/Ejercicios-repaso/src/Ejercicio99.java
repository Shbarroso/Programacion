import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que, dado un número de días ingresado por el usuario,
 * calcule y muestre la fecha resultante en el futuro desde la fecha actual.
 */

public class Ejercicio99 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de días: ");
        int numeroDias = scanner.nextInt();

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFutura = fechaActual.plusDays(numeroDias);

        System.out.println("La fecha resultante en el futuro es: " + fechaFutura);
    }
}