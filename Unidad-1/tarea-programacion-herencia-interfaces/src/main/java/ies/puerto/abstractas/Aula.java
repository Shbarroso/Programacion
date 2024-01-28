package ies.puerto.abstractas;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String nombre;
    private Profesor profesor;
    private List<Alumno> listaAlumnos;

    public Aula(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
        listaAlumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public List<Alumno> getAlumnos() {
        return listaAlumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.listaAlumnos = alumnos;
    }

    public float obtenerNotaMedia(List<Alumno> listaAlumnos) {
        float sumaNotas = 0;
        int cantidadAlumnos = listaAlumnos.size();

        for (Alumno alumno : listaAlumnos) {
            List<Nota> notas = alumno.getNotas();
            for (Nota nota : notas) {
                sumaNotas += nota.getValor();
            }
        }

        float notaMedia = sumaNotas / cantidadAlumnos;
        return notaMedia;
    }
}
