package main.java.productos;

import main.java.abstractas.Producto;


public class Alimento extends Producto {
    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return getPrecio() * 0.23f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

}
