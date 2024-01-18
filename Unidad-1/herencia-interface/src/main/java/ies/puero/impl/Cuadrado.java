package ies.puero.impl;

import ies.abstrac.RegularesAbstrat;
import ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstrat implements IFormaGeometrica {
    public Cuadrado(float lado) {
        super(lado, lado);
    }
    public Cuadrado (float base, float altura) {
        super(base, altura);
    }
    @Override
    public float calcularArea() {
        return getAltura()*getBase();
    }
}
