import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * @author Shbarroso
 * Haga un programa que determine si una fecha ingresada por el usuario corresponde
 * a un día festivo específico (por ejemplo, Navidad o Año Nuevo) y muestre un mensaje adecuado.
 */

public class Ejercicio100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una fecha: ");
        String fechaIngresada = scanner.nextLine();

        String[] partesFecha = fechaIngresada.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anio = Integer.parseInt(partesFecha[2]);

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        if (esNavidad(fecha)) {
            System.out.println("La fecha ingresada corresponde a Navidad.");
        } else if (esAnioNuevo(fecha)) {
            System.out.println("La fecha ingresada corresponde a Año Nuevo.");
        } else {
            System.out.println("La fecha ingresada no corresponde a un día festivo específico.");
        }
    }

    public static boolean esNavidad(LocalDate fecha) {
        return fecha.getMonth() == Month.DECEMBER && fecha.getDayOfMonth() == 25;
    }

    public static boolean esAnioNuevo(LocalDate fecha) {
        return fecha.getMonth() == Month.JANUARY && fecha.getDayOfMonth() == 1;
    }
}