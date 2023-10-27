package ies.puerto;


public class Ejercicio3 {
    public int suma (int valor1, int valor2){
        return valor1 + valor2;
    }
    public int suma (int valor1, int valor2, int valor3){
        int resultado = suma(valor1,valor2);
        return suma (resultado,valor3);

    }
    public int suma (int valor1, int valor2, int valor3, int valor4){
        int resultado = suma (valor1, valor2, valor3);
        return suma (resultado,valor4);

    }
    public int creciente (int valor1, int valor2){
        int resultado = valor1;
        if (valor2 > valor1){
            resultado = valor2;
        }
        return resultado;
    }

    public int creciente (int valor1, int valor2, int valor3){
        int resultado = creciente(valor1,valor2);
        return resultado = creciente(resultado, valor3);
    }
    public int creciente ( int valor1, int valor2, int valor3, int valor4){
        int resultado = creciente(valor1,valor2,valor3);
        return resultado = creciente(resultado, valor4);
    }

}