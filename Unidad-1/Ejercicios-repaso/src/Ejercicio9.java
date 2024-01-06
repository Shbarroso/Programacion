import java.util.Scanner;

/**
 * @author Shbarroso
 * Escribe un programa que solicite al usuario su edad y luego muestre si es mayor de edad o no.
 */

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = scanner.nextInt();

        if ( edad < 18){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }

    }
}