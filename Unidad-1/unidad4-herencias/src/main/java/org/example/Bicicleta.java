package org.example;

public class Bicicleta extends Vehiculo {
    private String talla;

    public Bicicleta(String talla, String color) {
        super ();
        this.talla = talla;
    }
    @Override
    public  String toString() {
        return "Yo soy una Bicicleta, con talla "+this.talla+", y color "+this.getColor();
    }
}
