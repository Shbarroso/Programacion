package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        String strNumero = solicitatNumero();
        int numero = tranformarNumeroInt(strNumero);
'        System.out.printf("Valor del numero tranformado:" +numero);
'    }
    public static String solicitatNumero() {
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introdusca un valor:" );
        numero = scanner.nextLine();

        return numero;
    }

    public static int tranformarNumeroInt(String strNumero) throws Exception {
        int resultado = 0;
        try {
            resultado = Integer.parseInt(strNumero);
        }catch (NumberFormatException e){
            throw new Exception("El valor introducido:" +strNumero+"no es un numero");
        }

        return resultado;
    }
}
