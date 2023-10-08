package ies.iespuerto;

/**
 *
 * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean esPalindromo = verificarPalindromo(numero);

        if (esPalindromo) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }
    }

    public static boolean verificarPalindromo(int numero) {
        int numeroInvertido = 0;
        int numeroOriginal = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroOriginal == numeroInvertido;
    }
}

