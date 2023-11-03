package ies.puerto;

/**
 * Funcion para calcular una matriz transpuesta.
 * @author Shbarroso
 */
public class Ejercicio6 {
    /**
     * Dada una matriz cuadrada, encuentra su transpuesta.
     * @return
     */
    public static int calcularMatrizTraspuesta() {

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};

        int elemento = matriz[1][2];

        matriz[0][1] = 10;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        return
    }
}