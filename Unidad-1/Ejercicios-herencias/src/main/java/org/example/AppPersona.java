package org.example;

public class AppPersona {
    static Persona persona;
    static Alumno alumno;
    static Estudiante estudiante;

    public static void main(String[] args) {
        persona = new Persona();
        System.out.println("Mesaje gemerico: " +persona.suSaludo());
        alumno = new Alumno("Samuel",19,12345678);
        System.out.println("Informacion del Alumno: ");
        System.out.println(alumno.toString());
        estudiante = new Estudiante("kjsdhf",123,1234);
        System.out.println(estudiante.suSaludo());
        System.out.println(estudiante.suCurso());
        System.out.println(estudiante.suNotas());
        System.out.println(estudiante.toString());
    }
}
