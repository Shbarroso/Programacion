package ies.puerto;

/**
 * @author Shbarroso
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private int carrera;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(int edad) {
        this.edad = edad;
    }

    public Estudiante(double promedio) {
        this.promedio = promedio;
    }

    public Estudiante( int carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }

    public void calcularEstado() {
        if (promedio >= 6.0) {
            System.out.println("Estado:Aprobado");
        }else{
            System.out.println("Estado: Reprobado");
        }
    }
    public String imprimirEstado() {
        String resultado ="";
        resultado = "Nombre:" +nombre+",Edad:" +edad+",Carrera:" +carrera+",Promedio:"+promedio;
        return resultado;
    }
}

