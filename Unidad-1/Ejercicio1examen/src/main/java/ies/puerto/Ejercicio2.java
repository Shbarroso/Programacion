package ies.puerto;

/**
 * @author Shbarroso
 */
public class Ejercicio2 {
    public  String calcularNota(float nota) {
        String calificacion ="";
        if (nota < 5) {
            return "suspendido";
        } else if (nota < 7) {
            return "aprobado";
        } else if (nota < 8) {
            return "bien";
        } else if (nota < 9) {
            return "notable";
        } else if(nota < 10) {
            return "sobresaliente";
        } else if (nota == 10) {
            calificacion = matricula;
        }
        return "matricula";
    }
    public String calcularCaso(float nota){
        int entero = (int) nota;
        String calificacion = "";

        switch(entero) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                calificacion = "Suspendido";
                break;
            case 5:
                calificacion ="aprobado";
                break;
            case 6:
                return "bien";
            case 7:
                return "notable";
            case 8:
                return "notable";
            case 9:
                return "sobresaliente";
            case 10:
                calificacion = "matricula";
        }

    }
    return calificacion;

}
