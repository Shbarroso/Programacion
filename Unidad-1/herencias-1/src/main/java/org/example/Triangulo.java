package org.example;

public class Triangulo extends Figura{
    public Triangulo(float base, float altura){
        super(base,altura);
    }
    @Override
    public float calcularArea(){
        return (getBase()*getAltura())/2;
    }
    @Override
    public String toString(){
        return "base:"+getBase()+", altura:"+getAltura();
    }
}
