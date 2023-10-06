package ies.iespuerto;

import java.util.Scanner;

/**
 *
 * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
 */
public class Ejercicio10 {
    public static void main(String[] args){

        Scanner lectura = new Scanner (System.in);
        int digitos=1;
        int numero;
        System.out.println("Ingrese el valor hasta donde calcular ");
        numero = lectura.nextInt();
        int  fin = 1;
        int resultado = 0;
        do {
            //si fin es par suma resultado + fin
            if (fin % 2 == 0) {
                System.out.println("fin:"+fin+", es par");
            }
            fin++;
        } while(fin < numero);
        System.out.println(digitos);

    }
}