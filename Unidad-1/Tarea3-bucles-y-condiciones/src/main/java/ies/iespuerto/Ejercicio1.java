package ies.iespuerto;

/**
 *
 *  Escribe un programa en Java que imprima el patrón siguiente:
 *
 * 1
 *
 * 2 3
 *
 * 4 5 6
 *
 * 7 8 9 10
 */
public class Ejercicio1 {
        public static void main(String[] args) {
            int numero = 1;

            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(numero + " ");
                    numero++;
                }
                System.out.println();
            }
        }
}
