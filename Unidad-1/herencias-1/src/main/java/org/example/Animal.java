package org.example;

public abstract class Animal {
    private String chip;
    private String nombre;

    public Animal() {}
    public Animal(String nombre, String chip) {
        this.nombre = nombre;
        this.chip = chip;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String suSonido() {
        return "Soy un sonido de Animal";
    }
    @Override
    public String toString() {
        return "Nombre: " +nombre+", chip: " +chip;
    }
}