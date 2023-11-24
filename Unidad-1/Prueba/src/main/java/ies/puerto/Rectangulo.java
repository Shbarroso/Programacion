package ies.puerto;

/**
 * @author Shbarroso
 */
public class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo(double largo) {
        this.largo = largo;
    }
    public Rectangulo(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        largo*ancho;

    }
    public double calcularPerimetro() {
        2 *(largo + ancho);
    }

}

