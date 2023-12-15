import java.util.Scanner;

public class Arbol2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el número de columnas: ");
            int numColumnas = scanner.nextInt();

            for (int i = 1; i <= numColumnas; i++) {
                for (int j = 1; j <= numColumnas - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
