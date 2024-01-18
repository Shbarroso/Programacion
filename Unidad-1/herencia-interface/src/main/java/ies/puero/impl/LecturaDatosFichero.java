package ies.puero.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosFichero implements ILecturaDatos {

    @Override
    public String Lectura() {
        return "Realizar la luctura de datos de fichero";
    }

    @Override
    public String apertura() {
        return null;
    }

    @Override
    public String cierre() {
        return null;
    }
}
