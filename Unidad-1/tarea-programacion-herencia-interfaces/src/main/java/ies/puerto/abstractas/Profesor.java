package ies.puerto.abstractas;

public class Profesor extends EmpleadoAbstracto {
    private String especialidad;

    public Profesor(String nombre, String dni, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, dni, fechaNacimiento, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int anios() {
        return 2;
    }
}