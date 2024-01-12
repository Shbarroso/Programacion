package org.example;
public class Estudiante extends Persona{
    private String curso;
    private int notas;

    public Estudiante(String nombre, int edad, int dni){
        super(nombre, edad, dni);
        this.curso = curso;
        this.notas = notas;
    }
    public String suCurso(){
        return "Estudiante tiene un curso";
    }
    public String suNotas(){
        return "Estudiante tiene notas";
    }

    @Override
    public String suSaludo(){
        return "hola profesor, como esta";
    }
}
