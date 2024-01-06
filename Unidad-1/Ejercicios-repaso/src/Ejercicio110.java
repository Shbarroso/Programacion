/**
 * @author Shbarroso
 * Agrega un atributo dni (Documento Nacional de Identidad) a la clase Persona y desarrolla
 * un método para validar si un DNI ingresado es válido.
 */

public class Ejercicio110 {

        private String nombre;
        private String apellido;
        private int edad;
        private String dni;

    public Ejercicio110(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public Ejercicio110() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean validarDNI(String dni) {
            if (dni.length() != 8) {
                return false;
            }

            try {
                Integer.parseInt(dni);
            } catch (NumberFormatException e) {
                return false;
            }

            int dniNumero = Integer.parseInt(dni.substring(0, 7));
            char dniVerificador = dni.charAt(7);
            int resto = dniNumero % 23;
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                    'V', 'H', 'L', 'C', 'K', 'E'};
            char letraCalculada = letras[resto];

            return dniVerificador == letraCalculada;
    }

    public static void main(String[] args) {
            Ejercicio110 persona = new Ejercicio110();
            persona.setNombre("Juan");
            persona.setApellido("Perez");
            persona.setEdad(30);
            persona.setDni("12345678");

            boolean dniValido = persona.validarDNI(persona.getDni());

            if (dniValido) {
                System.out.println("El DNI ingresado es válido.");
            } else {
                System.out.println("El DNI ingresado no es válido.");
            }
    }
}
