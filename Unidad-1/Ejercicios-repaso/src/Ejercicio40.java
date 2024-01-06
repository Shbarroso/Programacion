import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que determine si un año ingresado por el usuario es bisiesto o no
 * (recuerda que un año es bisiesto si es divisible por 4, pero no por 100, o si es divisible por 400).
 */

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El anio ingresado es bisiesto.");
        } else {
            System.out.println("El anio ingresado no es bisiesto.");
        }
    }
}