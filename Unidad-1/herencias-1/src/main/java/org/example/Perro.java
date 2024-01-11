package org.example;

public class Perro extends Gato{

    public Perro(String nombre, String chip) {
        super(nombre, chip);
    }

    @Override
    public String suSonido () {
        return "Guauuuu";
    }
}
