package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void calcularNumeroOkTest() {
        int resultado = ejercicio2.calcularNumero(5);
        Assertions.assertEquals(5, resultado,"No se a obtenido el resultado esperado");

    }
}
