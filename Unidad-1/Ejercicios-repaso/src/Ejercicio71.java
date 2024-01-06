import java.util.Scanner;

/**
 * @author Shbarroso
 * Crea un programa que simula un juego de adivinanza. Elige un número aleatorio entre
 * 1 y 10 y pide al usuario que adivine. Utiliza un bucle do- while para continuar el juego hasta que el usuario
 * adivine el número.
 */

public class Ejercicio71 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 10) + 1;
        int numeroUsuario;

        do {
            System.out.print("Adivina el número (entre 1 y 10): ");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número es mayor. ¡Sigue intentando!");
            } else if (numeroUsuario > numeroAdivinar) {
                System.out.println("El número es menor. ¡Sigue intentando!");
            } else {
                System.out.println("¡Felicitaciones! Has adivinado el número.");
            }
        } while (numeroUsuario != numeroAdivinar);

    }
}