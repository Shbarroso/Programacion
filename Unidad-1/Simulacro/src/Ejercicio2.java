/**
 * @author Shbarroso
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra = "supercalifragilistico";
        int contador = 0;

        for(int x=0;x<palabra.length();x++) {

        }
        for(int x=0;x<palabra.length();x++) {
            if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='e') || (palabra.charAt(x)=='i') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='u')){
                contador++;
            }
        }
        System.out.println("La palabra " + palabra + "contiene " + contador + " vocales");
    }
}