package org.example;

/**
 * @author Shbarroso
 */
public class Coche extends Vehiculo{
    private String color;
    private Conductor conductor;

    public Coche (String marca, String modelo, int precio){
        super(marca, modelo, precio);
    }

    public Coche(String marca, String modelo, int precio, String color, Conductor conductor) {
        super(marca, modelo, precio);
        this.color = color;
        this.conductor = conductor;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

}
