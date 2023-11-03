package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    @BeforeEach
    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public int calcularParOkTest() {
        int [] array = {1, 2, 3, 4, 5};
        int[] arrayOk = {2, 4};
        int resulatdo = ejercicio4.calcularPares();
        Assertions.assertEquals(resulatdo,"Los pares son");
    }

}