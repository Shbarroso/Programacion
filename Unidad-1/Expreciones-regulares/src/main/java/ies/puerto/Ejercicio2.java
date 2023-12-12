package ies.puerto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shbarroso
 * Desarrolla un programa que extraiga todos los números de teléfono
 * válidos (con formato +XX-XXX-XX-XX-XX) de una cadena dada. (Convina lo aprendido).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String telefono = "+34-640-69-29-51";

        String regex = "(\\d{2})-(\\d{3})-(\\d{2})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefono);

        while (matcher.find()) {
            String numero1 = matcher.group(1);
            String numero2 = matcher.group(2);
            String numero3 = matcher.group(3);
            String numero4 = matcher.group(4);
            String numero5 = matcher.group(5);

            System.out.println("numero1: " + numero1);
            System.out.println("numero2: " + numero2);
            System.out.println("numero3: " + numero3);
            System.out.println("numero4: " + numero4);
            System.out.println("numero5: " + numero5);
        }
    }
}