import java.util.Scanner;

/**
 * @author Shbarroso
 * Haz un programa que calcule el promedio de las notas almacenadas en una matriz de decimales.
 */

public class Ejercicio84 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        System.out.print("Ingrese el número de materias: ");
        int numMaterias = sc.nextInt();
        double[][] matrizNotas = new double[numEstudiantes][numMaterias];

        System.out.println("Ingrese las notas de los estudiantes:");
        for (int i = 0; i < numEstudiantes; i++) {
            for (int j = 0; j < numMaterias; j++) {
                System.out.print("Nota del estudiante " + (i + 1) + " en la materia " + (j + 1) + ": ");
                matrizNotas[i][j] = sc.nextDouble();
            }
        }

        double sumaTotal = 0;
        int contadorNotas = 0;

        for (int i = 0; i < numEstudiantes; i++) {
            for (int j = 0; j < numMaterias; j++) {
                sumaTotal += matrizNotas[i][j];
                contadorNotas++;
            }
        }

        double promedio = sumaTotal / contadorNotas;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}