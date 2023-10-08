package ies.iespuerto;

/**
 *
 * Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Los números Armstrong entre 1 y 1000 son:");

        for (int i = 1; i <= 1000; i++) {
            if (esArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean esArmstrong(int numero) {
        int numeroOriginal = numero;
        int suma = 0;

        while (numero != 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, contarDigitos(numeroOriginal));
            numero /= 10;
        }

        return suma == numeroOriginal;
    }

    public static int contarDigitos(int numero) {
        int contador = 0;

        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        return contador;
    }
}

