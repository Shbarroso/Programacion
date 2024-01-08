package org.example;

public class Vehiculo {
    private String color;

    public Vehiculo(String color) {
        this.color = color;
    }

    public Vehiculo() {

    }

    public void mover () {
        System.out.println("El vehiculo se esta moviendo");
    }
    public void miColor(){
        System.out.println("Mi colo es: "+color);
    }
    public String toString() {
        return "Mi color es "+color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void apagar() {
        System.out.println("El vehiculo esta apagado");
    }
}