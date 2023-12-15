import java.util.Scanner;

public class ArbolInvertido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de columnas: ");
        int numColumnas = scanner.nextInt();


        for (int i = numColumnas; i >= 1; i--) {
            for (int j = 1; j <= numColumnas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
