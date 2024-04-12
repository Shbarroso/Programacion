package es.ies.puerto.enumerado;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorArcoirisTest {
    EnumColorArcoiris colorArcoiris;

    @BeforeEach
    public void beforeEach() {

    }


    @Test
    public void colorArcoirisRojoTest(){
        colorArcoiris = colorArcoiris.ROJO;
        System.out.println(colorArcoiris);
        Assertions.assertEquals(EnumColorArcoiris.ROJO, colorArcoiris);
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris));
    }

    @Test
    public void colorArcoirisAmarilloTest(){
        colorArcoiris = colorArcoiris.AMARILLO;
        System.out.println(colorArcoiris);
        Assertions.assertEquals(EnumColorArcoiris.AMARILLO, colorArcoiris);
        Assertions.assertTrue(EnumColorArcoiris.AMARILLO.equals(colorArcoiris));
    }

    @Test
    public void colorArcoirisMiColorTest(){
        colorArcoiris = colorArcoiris.valueOf("ROJO");
        Assertions.assertEquals(EnumColorArcoiris.ROJO, colorArcoiris);
        Assertions.assertTrue(EnumColorArcoiris.ROJO.equals(colorArcoiris));

    }
}
