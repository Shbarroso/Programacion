package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void personaNombreTestOk() {
        String nombre = "Juan";
        Persona persona = new Persona(nombre);
        Assertions.assertEquals("Juan", nombre, persona.getNombre());
    }
    @Test
    public void personaEdadTestOk() {
        int edad = 20;
        Persona persona = new Persona(edad);
        Assertions.assertEquals(20, edad, persona.getEdad());
    }
    @Test
    public void personaEmailTestOk() {
        String email = "Juan@gmail.com";
        Persona persona = new Persona(email);
        Assertions.assertEquals("Juan@gmail.com", email, persona.getEmail());
    }
    @Test
    public void personaTelefonoTestOk() {
        int telefono = 12345678;
        Persona persona = new Persona(telefono);
        Assertions.assertEquals(12345678, telefono, persona.getTelefono());
    }
}

