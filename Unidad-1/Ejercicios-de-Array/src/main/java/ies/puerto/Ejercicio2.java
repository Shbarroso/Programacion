package ies.puerto;


public class Ejercicio2{


    /**
     * Calcula el promedio de los elementos en un array de números en punto flotante.
     * @return promedio
     */
        public float promedioNumeros () {
            float[] array = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
            float suma = 0;
            float promedio;
            for (int i = 0; i < array.length; i++) {
                suma += array[i];
            }
            promedio = suma / array.length;
            return promedio;
        }
    }