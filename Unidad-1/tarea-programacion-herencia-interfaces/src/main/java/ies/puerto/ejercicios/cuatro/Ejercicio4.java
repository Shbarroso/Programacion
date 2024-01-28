package ies.puerto.ejercicios.cuatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    static List<Integer> lista1;
    static List<Integer> lista2;

    public static void main(String[] args) {
        lista1 = new ArrayList<>();
        lista1.addAll(Arrays.asList(1,2,4));
        lista2 = new ArrayList<>(Arrays.asList(10,20,5,6,4,9));
        List<Integer> listaNoComun = new ArrayList<>(Arrays.asList(10,20,5,6,4,9));

        System.out.println("Las lista tienen elementos comunes:" +elementosComun(lista1,lista2));
        System.out.println("Las lista tienen elementos comunes:" +elementosComun(lista1,listaNoComun));

    }
    public static boolean elementosComun (List<Integer> lista1, List<Integer> lista2) {
        if (lista2.size() > lista1.size()) {
            List<Integer> temporal = lista1;
            lista1 = lista2;
            lista2 = temporal;
        }
        for (Integer elemento : lista1) {
            if (lista2.contains(elemento)) {
                return true;
            }
        }
        return false;
    }
}
