package empleados;

import abstracta.Trabajador;

public abstract class Empleado extends Trabajador {
    public Empleado(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento, salario);
    }
}