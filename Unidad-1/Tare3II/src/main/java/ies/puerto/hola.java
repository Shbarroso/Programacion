package ies.puerto;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        int edad;

        edad = 10;
        nombre = "Juan";
        Persona persona = new Persona(nombre, edad);
        System.out.println("Es mayor edad: " + persona.mayorEdad());

    }
    private static class Persona {
        String nombre;
        int edad;
        public  Persona () {}
        public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
        }

        public  boolean mayorEdad() {
            if ( edad > 18) {
                return true;
            }
            return false;
        }

    }

}
