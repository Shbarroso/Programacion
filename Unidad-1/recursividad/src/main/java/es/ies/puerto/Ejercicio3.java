package es.ies.puerto;

public class Ejercicio3 {
    public int sumaNumerosTradicional(int numero) {
        int resultado = 0;
        for (int i = numero; i >=1; i--) {
            resultado += numero;
        }
        return resultado;
    }

    public int sumaNaturalRecursiva(int numero) {
        if(numero == 1) {
            return 1;
        }
        numero + sumaNaturalRecursiva(numero-1);
    }
}
