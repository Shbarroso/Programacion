package ies.puerto;

/**
 * @author Shbarroso
 */
public class Ejercicio6 {

    public void crearDiagonal() {
        int[][] matriz = new int[5][15];

        for (int i= 0; i < matriz.length; i++) {
            for (int j=0; j < matriz.length; j++) {
                if (i==0 || i == matriz.length-1){
                    matriz[i][j] = 1;
                }
                if (i==0 || j == matriz[i].length-1) {
                    matriz[i][j] = 1;
                }
            }
        }
    }
}