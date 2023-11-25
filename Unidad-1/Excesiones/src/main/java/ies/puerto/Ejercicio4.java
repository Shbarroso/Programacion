package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        String texto = null;

    }

    public static int metodoNulo () throws Exception {
        int resutado = 0;

        try {
            resutado = texto.length();
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción NullPointerException: " + e.getMessage());
        }
        return resutado;
    }
}