import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que solicite al usuario ingresar su fecha de nacimiento
 * y muestre su edad exacta en años, meses y días.
 */

public class Ejercicio97 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento: ");
        String fechaNacimientoString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("29-12-2004");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, formatter);

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int anios = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        System.out.println("Tu edad exacta es: " + anios + " años, " + meses + " meses y " + dias + " días.");
    }
}