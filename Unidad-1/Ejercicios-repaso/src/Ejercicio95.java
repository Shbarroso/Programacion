import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Haz un programa que compare dos fechas ingresadas por el usuario y determine cuál es anterior, o si son iguales.
 */

public class Ejercicio95 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera fecha: ");
        String fecha1 = scanner.nextLine();

        System.out.print("Ingrese la segunda fecha: ");
        String fecha2 = scanner.nextLine();

        LocalDate fecha01 = LocalDate.parse(fecha1);
        LocalDate fecha02 = LocalDate.parse(fecha2);

        int comparacion = fecha01.compareTo(fecha02);

        if (comparacion < 0) {
            System.out.println("La primera fecha es anterior a la segunda fecha.");
        } else if (comparacion > 0) {
            System.out.println("La segunda fecha es anterior a la primera fecha.");
        } else {
            System.out.println("Las fechas son iguales.");
        }
    }
}