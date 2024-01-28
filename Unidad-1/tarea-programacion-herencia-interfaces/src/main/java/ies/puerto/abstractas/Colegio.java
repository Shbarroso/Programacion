package ies.puerto.abstractas;

import java.util.ArrayList;
import java.util.List;

public class Colegio {
    private String nombre;
    private String dirección;
    private String ubicación;
    private List<Aula> listaAulas;

    public Colegio(String nombre, String dirección, String ubicación) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.ubicación = ubicación;
        listaAulas = new ArrayList<>();
    }

    public void agregarAula(Aula aula) {
        listaAulas.add(aula);
    }

    public List<Aula> getAulas() {
        return listaAulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.listaAulas = aulas;
    }

    public float obtenerNotaMaxima() {
        float notaMaxima = 0;

        for (Aula aula : listaAulas) {
            for (Alumno alumno : aula.getAlumnos()) {
                for (Nota nota : alumno.getNotas()) {
                    if (nota.getValor() > notaMaxima) {
                        notaMaxima = nota.getValor();
                    }
                }
            }
        }

        return notaMaxima;
    }
}
