package ies.iespuerto;

/**
 *
 * Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número n: ");
        int n = scanner.nextInt();

        System.out.println("Los primeros " + n + " términos de la secuencia de Fibonacci son:");

        for (int i = 0; i < n; i++) {
            int fibonacci = calcularFibonacci(i);
            System.out.print(fibonacci + " ");
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibo1 = 0;
        int fibo2 = 1;
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        return fibonacci;
    }
}

