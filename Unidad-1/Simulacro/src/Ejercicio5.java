import java.util.Scanner;
/**
 * @author Shbarroso
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de columnas:");
        int numColumnas = scanner.nextInt();

        if (numColumnas < 4) {
            throw new IllegalArgumentException("El número de columnas debe ser mayor o igual a 4");
        }

        for (int i = 1; i <= numColumnas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
