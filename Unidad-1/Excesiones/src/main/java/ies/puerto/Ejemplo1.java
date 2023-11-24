package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo1 {
    public static void main(String[] args)  {
        System.out.printf("");
        try {
            File archivo = new File("archivo.txt");
            FileReader lector = new FileReader(archivo);
        } catch (ArithmeticException exception) {
            System.out.printf("Es una exception aritmetic");
        }catch (FileNotFoundException fileNotFoundException) {
            System.out.printf("Es una excention FileNotFoundException");
        }




    }
}