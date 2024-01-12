package org.example;

public class AppVehiculo {
    static Coche coche;
    static Motocicleta motocicleta;
    static Conductor conductor;

    public static void main(String[] args) {
        System.out.println("La informacion de Coche es:");
        coche = new Coche("hola","todoterreno",12321 );
        System.out.println(coche.toString());

        System.out.println("LA informacion de motocicleta es: ");
        motocicleta = new Motocicleta("FIAT", "Familiar",12344);
        System.out.println(motocicleta.toString());

        System.out.println("La informacion de Conductor es: ");
        conductor = new Conductor("AUDI", "todoterreno", 12321);
        System.out.println(conductor.toString());
    }
}
