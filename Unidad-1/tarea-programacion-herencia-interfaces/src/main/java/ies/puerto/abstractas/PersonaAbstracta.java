package ies.puerto.abstractas;


public abstract class PersonaAbstracta {
    private String nombre;
    private String dni;
    private String fechaDeNacimiento;

    public PersonaAbstracta(String nombre, String dni, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public abstract int anios();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}