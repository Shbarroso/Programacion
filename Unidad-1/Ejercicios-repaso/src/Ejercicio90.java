/**
 * @author Shbarroso
 * Desarrolla un programa que rote una matriz de 3x3, 90º grados en sentido antihorario.
 */

public class Ejercicio90 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizRotada = rotarMatriz(matriz);

        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[i].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[i][j] = matriz[n - j - 1][i];
            }
        }
        return matrizRotada;
    }
}