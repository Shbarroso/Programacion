import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que determine el día de la semana de una fecha
 * ingresada por el usuario (por ejemplo, lunes, martes, etc.).
 */

public class Ejercicio93 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha: ");
        String fechaIngresada = scanner.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("29/12/2004");

        try {
            Date fecha = formato.parse(fechaIngresada);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha);

            int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

            String nombreDiaSemana = "";
            switch (diaSemana) {
                case Calendar.MONDAY:
                    nombreDiaSemana = "lunes";
                    break;
                case Calendar.TUESDAY:
                    nombreDiaSemana = "martes";
                    break;
                case Calendar.WEDNESDAY:
                    nombreDiaSemana = "miércoles";
                    break;
                case Calendar.THURSDAY:
                    nombreDiaSemana = "jueves";
                    break;
                case Calendar.FRIDAY:
                    nombreDiaSemana = "viernes";
                    break;
                case Calendar.SATURDAY:
                    nombreDiaSemana = "sábado";
                    break;
                case Calendar.SUNDAY:
                    nombreDiaSemana = "domingo";
                    break;
            }
            System.out.println("El día de la semana para la fecha ingresada es: " + nombreDiaSemana);
        } catch (Exception e) {
            System.out.println("Error al analizar la fecha ingresada.");
        }
    }
}