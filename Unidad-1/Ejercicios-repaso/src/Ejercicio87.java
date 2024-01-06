/**
 * @author Shbarroso
 * Crea un programa que toma una matriz de 3x3 y calcula su transpuesta.
 */

public class Ejercicio87 {

    public static void main(String[] args) {
        int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] transpuesta = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("La transpuesta de la matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}