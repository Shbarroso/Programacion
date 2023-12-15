import java.util.Scanner;

class ArbolMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de columnas: ");
        int numColumnas = scanner.nextInt();

        // Crear una matriz para almacenar la representación gráfica del árbol
        char[][] arbol = new char[numColumnas][numColumnas];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < numColumnas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                arbol[i][j] = ' ';
            }
        }

        // Construir la representación gráfica del árbol en la matriz
        for (int i = 0; i < numColumnas; i++) {
            arbol[i][numColumnas / 2] = '*';
        }

        for (int i = 0; i < numColumnas / 2; i++) {
            arbol[numColumnas - 1][i] = '-';
            arbol[numColumnas - 1][numColumnas - 1 - i] = '-';
        }

        // Mostrar la representación gráfica del árbol
        for (int i = 0; i < numColumnas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.print(arbol[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
