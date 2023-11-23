package ies.puerto;

/**
 * @author Shbarroso
 * Escribe un programa que encuentre el primer número divisible por 7 y 5 entre 1 y 100 (inclusive), utilizando break.
 */
public class Ejercicio1break {
    public static void main(String[] args) {
        int [] numeros = new int[100];
        for (int i=0; i< numeros.length; i++) {
            numeros[i] = i+1;
        }

        for (int num : numeros) {
            System.out.printf("Comprobar numero: " + num);
            if (num % 7 == 0 && num % 5 == 0){
                System.out.printf("Primer numero divisible entre 5 y 7: " +num);
                break;
            }
        }
    }
}
