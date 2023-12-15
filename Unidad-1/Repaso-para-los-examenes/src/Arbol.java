import java.util.Scanner;

 public class Arbol {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Ingrese el número de columnas: ");
         int numColumnas = scanner.nextInt();
     }
     public static void numColumnas(int numColumnas) {
         for (int i = 0; i < numColumnas; i++) {
             for (int j =0; j <= numColumnas -i; j++) ;
             System.out.println("");
         }
         for (int j = 1; j <= 2 * numColumnas - 1; j++) {
             System.out.print("*");
         }
     }



 }