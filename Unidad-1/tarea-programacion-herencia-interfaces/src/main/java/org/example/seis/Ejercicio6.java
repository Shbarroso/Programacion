package org.example.seis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio6 {

    static List<String> lista;

    public static void main(String[] args) {
        lista = new ArrayList<>(Arrays.asList("uno","dos","leche", "agua" ,"dos", "leche"));

        System.out.println("Lista sin duplicados:"+eliminarCadenasDuplicadas(lista));
    }

    static  List<String> eliminarCadenasDuplicadas(List<String> lista) {
        List<String> resultado = new ArrayList<>();

        for(String elemento:lista) {
            if(!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}
