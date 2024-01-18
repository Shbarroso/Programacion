package ies.puero.impl;

import ies.abstrac.LecturaDatosAbstract;
import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosBaseDatos extends LecturaDatosAbstract {

    @Override
    public String apertura() {
        return "Apertura de la BBDD";
    }

    @Override
    public String lectura() {
        return "hola";
    }

    @Override
    public String cierre() {
        return "Cierre de la BBDD";
    }
}
