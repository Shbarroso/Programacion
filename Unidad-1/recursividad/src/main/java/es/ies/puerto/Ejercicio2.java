package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public List<Integer> cuentaDescendente(int numero) {
        List<Integer> lista = new ArrayList<>();
        for(int i = numero; i>= 0; i--) {
            lista.add(i);
        }
        return lista;
    }

    public List<Integer> cuentaDescendenteRecursiva(int numero) {
        List<Integer> lista = new ArrayList<>();
        lista.add(numero);
        if (numero == 0) {
            return lista;
        }
        lista.addAll(cuentaDescendenteRecursiva(numero -1));
        return lista;
    }
}
