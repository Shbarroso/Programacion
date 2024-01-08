package org.example;

public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Bicicleta miBiciclta;
    static Coche miCocheMatricula;
    public static void main (String[] args) {
        miCoche = new Coche();
        miCoche.mover();
        miCoche.miColor();
        miCoche.toString();
        System.out.println(miCoche.toString());

        miCocheColor = new Coche("Rojo");
        miCocheColor.mover();
        miCocheColor.miColor();
        miCocheColor.toString();
        System.out.println(miCocheColor.toString());

        miCocheMatricula = new Coche("Azul", "TFHK35");
        miCocheMatricula.mover();
        miCocheMatricula.miColor();
        System.out.println(miCocheMatricula.toString());

        miBiciclta = new Bicicleta("L","Negro");
        miBiciclta.mover();
        miBiciclta.miColor();
        miBiciclta.toString();
        System.out.println(miBiciclta.toString());
    }
}
