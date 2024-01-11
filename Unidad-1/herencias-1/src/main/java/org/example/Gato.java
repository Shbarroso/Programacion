package org.example;

public class Gato extends Especie{


    public Gato(String nombre, String chip) {
        super(nombre, chip);
    }
    @Override
    public String suSonido(){
        return "miauuuuuuuu";
    }
}
