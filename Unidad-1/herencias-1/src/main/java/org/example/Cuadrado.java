package org.example;

public class Cuadrado extends Rectangulo{

    public Cuadrado(){}
    public Cuadrado(float lado){
        super(lado, lado);
    }


    @Override
    public String toString(){
        return "Lado A:"+getBase()+", Lado B:"+getAltura();
    }

}
