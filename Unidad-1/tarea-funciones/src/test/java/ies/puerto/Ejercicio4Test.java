package ies.puerto;

import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4;

    @beforeEach
    public void before() {ejercicio4 = new Ejercicio4();}

    @Test

    public void calcularMaxDosNumerosTest () {
        double resultado = ejercicio4.calcularMaxDosNumeros(1,2);

    }

}