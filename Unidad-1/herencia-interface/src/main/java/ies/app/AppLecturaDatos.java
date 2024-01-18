package ies.app;

import ies.abstrac.LecturaDatosAbstract;
import ies.puero.impl.LecturaDatosBaseDatos;
import ies.puero.impl.LecturaDatosFichero;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {
    static LecturaDatosAbstract lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        //tipo(lecturaDatos);
    }
    public static void tipo(ILecturaDatos lecturaDatos) {
        System.out.println(lecturaDatos.getClass().getName());
    }
}
