package ies.puerto;

import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void calcularMaximoOkTest() ´{
       int [] array = {1, 2, 3, 4, 5};
       int maximo = ejercicio3.calcularMximo(array)
    }
    @Test
    public void calcularMinimoTest() {
        int resultado = ejercicio3.calcularMinimo();
        Assertions.asserEqual();
    }


}
