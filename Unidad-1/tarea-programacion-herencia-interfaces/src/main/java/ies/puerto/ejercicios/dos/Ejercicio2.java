package ies.puerto.ejercicios.dos;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Ejercicio2 {
    static List<String> listaCadena;

    public static void main(String[] args) {
        //System.out.println(listaCadena);
        listaCadena = new ArrayList<>();
        listaCadena.add("No comienzo por A");
        listaCadena.add("Tampoco comienzo por A");
        listaCadena.add("Aveces comienzo por A");
        listaCadena.add("Adios mundo cruel");
        listaCadena.add("El profe de programacion es el mejor");
        listaCadena.add("Le vamos a traer una caja de dulces");
        listaCadena.add("Angelo trae la caja de dulces");

        int contador = 0;
        for (String cadena:listaCadena) {
            if (comienzaPorA(cadena)) {
                contador++;
            }
        }
        System.out.println("Numero de cadenas que comienza por A:"+contador);
    }

    private static boolean comienzaPorA(String cadena) {
        String regex = "^[a|A].*";

        if (Pattern.matches(regex,cadena)) {
            return true;
        }
        return false;
    }
}
