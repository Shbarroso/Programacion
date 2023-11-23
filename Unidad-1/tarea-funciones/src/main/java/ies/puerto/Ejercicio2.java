package ies.puerto;

public class Ejercicio2 {
    /**
     * Realiza una función que realiza el cálculo del área en circulo.
     * @param radio  de un circulo
     * @return resultado
     */
    public double areaCirculo(int radio) {
        double resultado = 0;
        double pi = Math.PI;

        resultado = Math.pow(radio, 2)*pi;


        return resultado;
    }
}