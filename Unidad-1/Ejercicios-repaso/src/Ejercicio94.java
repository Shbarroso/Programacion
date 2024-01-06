import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.chrono.Chronology;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que, dado un mes y año ingresados por el usuario, calcule y muestre
 * cuántos días faltan hasta el final del mes.
 */

public class Ejercicio94 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el anio: ");
        int anio = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, 1);

        int ultimoDiaMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int diaActual = calendar.get(Calendar.DAY_OF_MONTH);
        int diasFaltantes = ultimoDiaMes - diaActual;
        System.out.println("Faltan " + diasFaltantes + " días hasta el final del mes.");
    }
}