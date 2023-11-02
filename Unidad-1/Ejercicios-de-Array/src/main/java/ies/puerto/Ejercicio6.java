package ies.puerto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ejercicio6 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

        int elemento = matriz[1][2];

        matriz[0][1] = 10;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}