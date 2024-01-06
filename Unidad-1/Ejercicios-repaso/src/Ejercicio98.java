import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que calcule y muestre el número de días entre dos fechas ingresadas por el usuario.
 */

public class Ejercicio98 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha: ");
        String fecha1 = scanner.nextLine();

        System.out.println("Ingrese la segunda fecha: ");
        String fecha2 = scanner.nextLine();

        String[] partesFecha1 = fecha1.split("/");
        int dia1 = Integer.parseInt(partesFecha1[0]);
        int mes1 = Integer.parseInt(partesFecha1[1]) - 1;
        int anio1 = Integer.parseInt(partesFecha1[2]);

        String[] partesFecha2 = fecha2.split("/");
        int dia2 = Integer.parseInt(partesFecha2[0]);
        int mes2 = Integer.parseInt(partesFecha2[1]) - 1;
        int anio2 = Integer.parseInt(partesFecha2[2]);

        Calendar cal1 = Calendar.getInstance();
        cal1.set(anio1, mes1, dia1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(anio2, mes2, dia2);

        long diferenciaEnMilisegundos = cal2.getTimeInMillis() - cal1.getTimeInMillis();
        long dias = diferenciaEnMilisegundos / (24 * 60 * 60 * 1000);

        System.out.println("El número de días entre las dos fechas es: " + dias);
    }
}