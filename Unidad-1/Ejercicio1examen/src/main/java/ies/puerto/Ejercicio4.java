package ies.puerto;


/**
 * @author Shbarroso
 */
public class Ejercicio4 {
    private String titular;
    private double saldo;


    public Ejercicio4 () {}
    public Ejercicio4(String titular) {
        this.titular = titular;
    }

    /**
     * Creacion de una cuenta Bancaria
     * @param saldo de la cuenta
     */
    public Ejercicio4(double saldo) {
        this.saldo = saldo;
    }
    public Ejercicio4 (String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    /**
     *Getter de una cuenta Bancaria
     * @return titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Getter de una cuenta Bancaria
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if ( deposito > 0) {
            this.saldo += deposito;
        }
    }
    public  boolean retirar(double saldo){
        if ( (this.saldo -saldo) > 0) {
            this.saldo -=saldo;
            return true;
        }
        return false;
    }
    public  String imprimir () {
        return "titular:"+titular+"saldo:"+saldo;
    }
    public String toString () {
        return "titular:"+titular+"saldo:"+saldo;
    }

}
