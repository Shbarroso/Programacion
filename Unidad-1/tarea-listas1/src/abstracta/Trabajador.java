package abstracta;

public abstract class Trabajador extends Persona {
    private float salario;

    public Trabajador(String nombre, String dni, String fechaNacimiento, float salario) {
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