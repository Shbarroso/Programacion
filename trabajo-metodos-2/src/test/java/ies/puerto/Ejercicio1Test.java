package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();
    @Test
    public void calcularSueldoHorasOkTest() {
        int numeroHoras = 10;
        int resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(100, resultado,"No se a obtenido el resultado esperado");


    }

}
