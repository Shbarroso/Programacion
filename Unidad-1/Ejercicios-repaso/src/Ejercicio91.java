import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Shbarroso
 * Escribe un programa que muestre la fecha actual en el formato "dd/MM/yyyy".
 */

public class Ejercicio91 {

    public static void main(String[] args) {
        Date fechaActual = new Date();

        DateFormat formatoFecha = new SimpleDateFormat("29-12-2004");

        String fechaFormateada = formatoFecha.format(fechaActual);

        System.out.println("Fecha formateada: " + fechaFormateada);
    }
}