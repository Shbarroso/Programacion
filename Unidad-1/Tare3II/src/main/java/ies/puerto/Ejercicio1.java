package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el numero de las columnas: ");

        int numColumnas = scanner.nextInt();
        int asterisco = 1;

        for (int i = 0; i <numColumnas; i++) {
            for (int j = 0; j <= (numColumnas -asterisco)/2; j++) {
                System.out.print(" ");
            }
            for (int k = numColumnas/2; k <numColumnas; k++ ){
                System.out.print("*");
                asterisco = asterisco+2;
            }
            for (int j = 0; j <= (numColumnas -asterisco)/2; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}