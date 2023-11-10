package ies.puerto;

/**
 * @author Shbarroso
 */
public class Banco {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public Banco(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public Banco (String nombreTitular) {
        this.nombreTitular;
    }

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String imprimir() {
        String resultado ="";
        resultado = "numeroCuenta:" +numeroCuenta+",nombreTitular:" +nombreTitular+",salto:" +saldo;
        return resultado;
    }
}

