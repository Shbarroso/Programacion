package ies.puerto;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        int[] matriz = new int[3];
        System.out.printf("Valor de la matriz introducida:" +matriz);

    }

    /**
     * Funcion que calcula el cuarto elemento
     * @param matriz
     * @return resultado
     */
    public static int accederCuartoElemento (int[]matriz) throws Exception {
        int resultado = 0;

        try{
            resultado = matriz[3];
            System.out.println("El cuarto elemento es: " + resultado);
        }catch (ArrayIndexOutOfBoundsException e)
        System.out.println("Error: Se intentó acceder a un índice fuera de los límites del array.");

        return resultado;
    }
}