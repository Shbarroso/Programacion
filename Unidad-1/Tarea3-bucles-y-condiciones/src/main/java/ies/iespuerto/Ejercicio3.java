package ies.iespuerto;

/**
 *
 * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la posición n: ");
        int n = scanner.nextInt();

        int fibonacci = calcularFibonacci(n);

        System.out.println("El número de Fibonacci en la posición " + n + " es: " + fibonacci);
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

