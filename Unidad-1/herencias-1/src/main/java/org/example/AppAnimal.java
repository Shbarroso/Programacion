package org.example;

public class AppAnimal {
    //static Animal animal;
    static Serpiente serpiente;
    static Loro loro;
    static Gato gato;
    static Perro perro;

    public static void main(String[] args) {
        //animal = new Animal();
        //System.out.println("Sonido Animal:" +animal.suSonido());
        gato = new Gato("Pepe","uno");
        System.out.println("Sonido Gato:" +gato.suSonido());
        System.out.println(gato.toString());
        perro = new Perro("Paco", "dos");
        System.out.println("Sonido perro:" + perro.suSonido());
        System.out.println(perro.toString());
        loro = new Loro("Juanito", "tres");
        System.out.println(loro.suSonido());
        serpiente = new Serpiente();
        System.out.println(serpiente.suSonido());
    }
}
