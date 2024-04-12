package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public List<Integer> paresTradicionales(int numero) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i <= numero; i+=2) {
            resultado.add(i);
        }
        return resultado;
    }
    public  List<Integer> paresRecursivos(int numero) {
        List<Integer> resultado = new ArrayList<>();
        if (numero%2 == 0) {
            resultado.add(numero);
        }
        if (numero == 0){
            return resultado;
        }
        resultado.addAll(paresRecursivos(numero -1));
        return resultado;
    }
}
