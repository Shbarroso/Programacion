package main.java;

import main.java.productos.Alimento;
import main.java.productos.Electronica;
import main.java.productos.Soubenir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Supermercado {
    private HashSet<Alimento> listaAlimentos;
    private ArrayList<Electronica> listaElectronica;
    private HashMap<String, Soubenir> mapaSoubenirs;

    public Supermercado() {
        listaAlimentos = new HashSet<>();
        listaElectronica = new ArrayList<>();
        mapaSoubenirs = new HashMap<>();
    }

    public void agregarAlimento(Alimento alimento) {
        listaAlimentos.add(alimento);
    }

    public void eliminarAlimento(Alimento alimento) {
        listaAlimentos.remove(alimento);
    }

    public Alimento obtenerAlimento(String udi) {
        for (Alimento alimento : listaAlimentos) {
            if (alimento.getUdi().equals(udi)) {
                return alimento;
            }
        }
        return null;
    }

    public void agregarElectronica(Electronica electronica) {
        listaElectronica.add(electronica);
    }

    public void eliminarElectronica(Electronica electronica) {
        listaElectronica.remove(electronica);
    }

    public Electronica obtenerElectronica(String udi) {
        for (Electronica electronica : listaElectronica) {
            if (electronica.getUdi().equals(udi)) {
                return electronica;
            }
        }
        return null;
    }

    public void agregarSoubenir(Soubenir soubenir) {
        mapaSoubenirs.put(soubenir.getUdi(), soubenir);
    }

    public void eliminarSoubenir(String udi) {
        mapaSoubenirs.remove(udi);
    }

    public Soubenir obtenerSoubenir(String udi) {
        return mapaSoubenirs.get(udi);
    }


    public float precioAlimentos() {
        float precioTotal = 0;
        for (Alimento alimento : listaAlimentos) {
            precioTotal += alimento.getPrecio();
        }
        return precioTotal;
    }

    public float precioElectronica() {
        float precioTotal = 0;
        for (Electronica electronica : listaElectronica) {
            precioTotal += electronica.getPrecio();
        }
        return precioTotal;
    }

    public float precioSoubenirs() {
        float precioTotal = 0;
        for (Soubenir souvenir : mapaSoubenirs.values()) {
            precioTotal += souvenir.getPrecio();
        }
        return precioTotal;
    }

    public float precioProductos() {
        return precioAlimentos() + precioElectronica() + precioSoubenirs();
    }

}
