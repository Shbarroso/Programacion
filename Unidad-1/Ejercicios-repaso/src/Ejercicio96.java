import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que permita al usuario ingresar una fecha y
 * un número de días, y calcule la fecha resultante después de sumar esos días.
 */

public class Ejercicio96 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha: ");
        String fechaString = scanner.nextLine();
        System.out.print("Ingrese el número de días a sumar: ");
        int dias = scanner.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("29-12-2004");
        LocalDate fecha = LocalDate.parse(fechaString, formatter);

        LocalDate fechaResultante = fecha.plusDays(dias);

        String fechaResultanteString = fechaResultante.format(formatter);
        System.out.println("La fecha resultante es: " + fechaResultanteString);
    }
}