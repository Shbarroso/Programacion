package ies.puerto.ejercicios.uno;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static List<Integer> listaNumerosPares;
    static List<Integer> listaNumerosImPares;

    public static void main(String[] args) {
        listaNumerosPares = new ArrayList<>();
        listaNumerosImPares = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            if (esNumeroPAr(i)) {
                listaNumerosImPares.add(i);
            }else {
                listaNumerosPares.add(i);
            }
        }
        System.out.println("Tamanio:" + listaNumerosImPares.size());
        System.out.println("Lista numeros impares:"+listaNumerosImPares);
        System.out.println("Lista numero pares:"+listaNumerosPares);
        System.out.println("Tamanio:" + listaNumerosPares.size());
    }

    /**
     * Funcion que verifica si un numero es par
     * @param i numero que verifica
     * @return true/ false si es o no par
     */
    private static boolean esNumeroPAr(int i) {

        if(i%2 == 0) {
            return true;
        }

        return false;
    }
}
