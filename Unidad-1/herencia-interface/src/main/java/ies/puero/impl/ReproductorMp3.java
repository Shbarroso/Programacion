package ies.puero.impl;

import ies.puerto.IReproductor;

public class ReproductorMp3 implements IReproductor {
    @Override
    public String reproducir() {
        return "Reproduciendo mp3";
    }

    @Override
    public String detener() {
        return "Deteniendo mp3";
    }
}
