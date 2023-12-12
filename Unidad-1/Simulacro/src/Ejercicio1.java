import java.util.Scanner;

/**
 * @author Shbarroso
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String texto = "";


        if (args.length == 1) {
            texto = args[0];
        }
        if (texto.equals("")) {
            Scanner lecturaTeclado = new Scanner(System.in);
            System.out.print("Introduzca una cadena de texto: ");
            texto = lecturaTeclado.nextLine();
        }
        if (!texto.isEmpty()) {
            System.out.print("La cadena \"" + texto + "\" invertida es: " + InvertirCadena(texto));
        } else {
            System.out.println("No ha introducido una cadena de texto.");
        }
    }
    public static String InvertirCadena(String texto) {
        String textoInvertida = "";
        for (int x = texto.length() - 1; x >= 0; x--)
            textoInvertida = textoInvertida + texto.charAt(x);
        return textoInvertida;
    }
}