import java.util.Scanner;

/**
 * @author Shbarroso
 * Desarrolla un programa que sume dos matrices de 3x3 y muestre el resultado.
 */

public class Ejercicio86 {

    public static void main(String[] args) {
        int[][] matriz1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matriz2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] resultado = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}