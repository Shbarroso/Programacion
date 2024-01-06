import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que tome el precio de un producto ingresado por el usuario
 * y muestre el precio final con el 7% de IGIC incluido .
 */

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el precio: ");
        double precio = scanner.nextDouble();
        int igic = 7;
        double preciofinal = precio +(precio*igic);
        System.out.println("El precio final con igic es: "+ preciofinal);

    }
}