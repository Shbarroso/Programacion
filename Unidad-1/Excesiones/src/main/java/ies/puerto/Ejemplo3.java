package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo3 {
    public static void main(String[] args) {
        System.out.printf("Hola");

        File archivo = new File("archivo.txt");

        System.out.printf("Voy a generar un NullPointer" +archivo.getName());
    }
}
