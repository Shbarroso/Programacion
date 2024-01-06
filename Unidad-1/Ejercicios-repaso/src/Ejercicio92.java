import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que calcule y muestre cuántos días han pasado desde
 * una fecha ingresada por el usuario hasta la fecha actual.
 */

public class Ejercicio92 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha: ");
        String fechaIngresada = scanner.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("29/12/2004");

        try {
            Calendar fechaUsuario = Calendar.getInstance();
            fechaUsuario.setTime(formato.parse(fechaIngresada));

            Calendar fechaActual = Calendar.getInstance();

            long diferencia = fechaActual.getTimeInMillis() - fechaUsuario.getTimeInMillis();
            long diasPasados = diferencia / (24 * 60 * 60 * 1000);

            System.out.println("Han pasado " + diasPasados + " días desde la fecha ingresada hasta la fecha actual.");
        } catch (Exception e) {
            System.out.println("Error al analizar la fecha ingresada.");
        }
    }
}