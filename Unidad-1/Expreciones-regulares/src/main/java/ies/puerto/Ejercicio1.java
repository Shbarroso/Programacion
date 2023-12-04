package ies.puerto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Shbarroso
 * Crea un programa que valide si una cadena es una dirección de correo electrónico válida utilizando
 * expresiones regulares.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String email = "samuelaurix2@gmail.com";

        String regex = "^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
    }
}