package ies.puerto;

/**
 * @author Shbarroso
 */
public class Circulo {
    private float radio;

    /**
     * Constructor por defecto de la clase
     */

    public Circulo() {}

    /**
     * Constructor con el parametro Circulo
     * @param radio del circulo
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }
    public float calcularCircunferencia() {
        return 2 *(Math.PI + radio);
    }


    public String imprimirInformacion() {
        String resultado ="";
        resultado = "radio:" +radio;
        return resultado;
}

