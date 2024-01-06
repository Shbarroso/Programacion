/**
 * @author Shbarroso
 * Haz un programa que utilice una constante para representar
 * el valor de PI (3.14159265) y calcule el área de un círculo.
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        double PI = 3.14159265;
        double radio = 5.0;

        double area = PI * radio * radio;

        System.out.println("El área del círculo es: " + area);
    }
}