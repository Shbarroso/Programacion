package ies.iespuerto;

import java.util.Scanner;

/**
 *
 * Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.
 */
public class Ejercicio9 {
    static Scanner lectura = new Scanner (System.in);
    public static void main(String[] args){
        int numero;
        System.out.println("Ingrese el valor del numero que quiere calcular la tabla: ");
        numero = lectura.nextInt();
        System.out.println ("Tabla del:" +numero);

        for(int i=1; i<=10; i++) {
            int resultado = numero*i;
            System.out.println(numero +"*"+i+"="+resultado);
        }


    }
}
