package alumnos;

import abstracta.Persona;
import notas.Nota;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
    private List<Nota> listaNotas;

    public Alumno(String nombre, String dni, String fechaNacimiento) {
        super(nombre, dni, fechaNacimiento);
        listaNotas = new ArrayList<>();
    }

    @Override
    public int anios() {
        return 0;
    }

    public void agregarNota(Nota nota) {
        listaNotas.add(nota);
    }

    public List<Nota> getNotas() {
        return listaNotas;
    }

}