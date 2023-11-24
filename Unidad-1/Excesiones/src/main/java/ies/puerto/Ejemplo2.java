package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo2 {
    public static void main(String[] args)  {
        int numeros = 10;
        int divisor = 0;
        try {
            int division = numeros/divisor;
            System.out.printf("Numero divido por 0: "+division);
        }catch ( ArithmeticException arithmeticException) {
            System.out.printf("Se a producido una arithmeticException, mensaje:"+arithmeticException.getMessage());
        }

    }
}