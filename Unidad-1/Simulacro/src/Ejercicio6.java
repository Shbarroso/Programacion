import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shbarroso
 */

public class Ejercicio6 {
    private String nombre;
    private String fecha;

    public Ejercicio6(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static void main(String[] args) {
        Ejercicio6 navidad = new Ejercicio6("Navidad");
        System.out.println("Nombre del evento: " + navidad.getNombre());
    }



    public static void main(String[] args) {
        String input = "15-02-2022";

        String regex = "(\\d{2})-(\\d{2})-(\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
    }

}