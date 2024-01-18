package ies.puero.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {
    @Override
    public String arrancar() {
        return "Se arranca el coche";
    }

    @Override
    public String detener() {
        return "Se detiene el coche";
    }
}
