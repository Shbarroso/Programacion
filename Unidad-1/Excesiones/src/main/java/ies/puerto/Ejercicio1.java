package ies.puerto;

import java.util.Scanner;

/**
 * @author Shbarroso
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int numero1 = solicitatNumero();
        int numero2 = solicitatNumero();
        int resultado = division(numero1, numero2);
        System.out.printf("Resultado de la division:" +resultado);
    }

    /**
     * Funcion que pide por teclado un numero
     * @return numero obtenido
     */
    public static int solicitatNumero() {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introdusca un valor:" );
        numero = scanner.nextInt();



        return numero;
    }

    /**
     * Funcion que realiza la division de dos numeros
     * @param dividendo de la division
     * @param divisor de la division
     * @return resultado
     */
    public static int division(int dividendo, int divisor) throws Exception {
        int resultado = 0;
        try {
            resultado = dividendo / divisor;
        }catch (ArithmeticException e) {
            String mensajeErorr = "Se intenta realizar una division por 0";
            System.out.printf("Se ha realizado una division por 0" +mensajeErorr);
            throw new Exception(mensajeErorr);
        }

        return resultado;
    }

}
