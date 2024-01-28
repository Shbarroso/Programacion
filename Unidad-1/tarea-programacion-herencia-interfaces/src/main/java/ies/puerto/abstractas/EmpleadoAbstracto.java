package ies.puerto.abstractas;

public abstract class EmpleadoAbstracto extends TrabajadorAbstracto {
    public EmpleadoAbstracto(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento, salario);
    }
}