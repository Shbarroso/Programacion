package ies.puerto;

import java.util.Scanner;

/**
 * Clase que realiza ejercicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args) {
        int valorA;
        int valorB;

        Scanner lectura = new Scanner(System.in);

        //Bloque 1: Pide por pantalla valor y asigna valor



        //Bloque 2: verifique si los valores son iguales

        do {
            System.out.println("Ingrese el valor de la variable A:");
            valorA = lectura.nextInt();
            System.out.println("Valor de la variable A:"+valorA);

            System.out.println("Ingrese el valor de la variable B:");
            valorB = lectura.nextInt();
            System.out.println("Valor de la variable B:"+valorB);
            if (valorA == valorB) {
                System.out.println("Los valores son iguales");
            }
        }while (valorA == valorB){

        }

        if (valorA == valorB) {
            System.out.printf("Los valores introducidos son iguales");
        } else {
            if (valorA > valorB) {
                System.out.printf("El valor de A es mayor");
            } else {
                System.out.printf("El valor de B es mayor");
            }
        }

        // Bloque 3: verifique si A > B

        //Bloque 4: muestra por pantalla el valor mayor

    }
}