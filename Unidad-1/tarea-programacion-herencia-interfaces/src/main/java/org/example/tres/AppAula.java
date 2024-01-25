package org.example.tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {
    static Aula dam1;

    public static void main(String[] args) {
        dam1 = new Aula("1Dam");

        Alumno alumno1 = new Alumno("nombre1", "apellido1", Arrays.asList(1f,2f,7f,8f));
        Alumno alumno2 = new Alumno("nombre2", "apellido2", Arrays.asList(10f,6f,7f,8f));
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);


        dam1.setAlumnos(alumnos);
        System.out.println("media aula:"+dam1.media());
    }
}
