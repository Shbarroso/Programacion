package ies.puerto;

public class Ejercicio2 {
    public int calcularNumero(int numero) {
        int resultado = 0;

        if (numero > 0) {
            return "El número es positivo.";
        } else if (numero < 0) {
            return "El número es negativo.";
        } else {
            return "El número es cero.";
        }

        if (numero % 2 == 0) {
            return "El número es par.";
        } else {
            return "El número es impar.";
        }

        return resultado;
    }
}
