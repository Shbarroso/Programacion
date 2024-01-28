package ies.puerto.abstractas;

public abstract class TrabajadorAbstracto extends PersonaAbstracta {
    private float salario;

    public TrabajadorAbstracto(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}