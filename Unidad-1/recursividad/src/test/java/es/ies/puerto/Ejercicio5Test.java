package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {
    Ejercicio5 ejercicio;
    int base = 2;
    int exponente = 3;
    int resultadoEsperado = 8;
    @BeforeEach
    public void beforeEach() {
        ejercicio = new Ejercicio5();
    }

    @Test
    public void ejercicio1Test() {
       int resultado = ejercicio.potenciaTradicional(base, exponente);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void ejercicioExponenteCeroTest() {
        int resultado = ejercicio.potenciaTradicional(base, 0);
        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void ejercicioExponenteCeroRecursivoTest() {
        int resultado = ejercicio.potenciaTradicional(base, 0);
        Assertions.assertEquals(1, resultado);
    }

    @Test
    public void ejercicioRecursivoTest() {
        int resultado = ejercicio.potenciaTradicional(base, exponente);
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}
