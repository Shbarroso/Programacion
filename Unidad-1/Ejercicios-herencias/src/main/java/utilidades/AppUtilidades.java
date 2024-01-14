package utilidades;

/**
 * @author Shbarroso
 */
public class AppUtilidades {
    public static void main(String[] args) {
        UtilidadesCal utilidadesCal;
        System.out.println("La informacion de las operaciones es:");
        utilidadesCal = new UtilidadesCal(6,2);
        System.out.println(utilidadesCal.toString1());
        System.out.println(utilidadesCal.toString2());
        System.out.println(utilidadesCal.toString3());
        System.out.println(utilidadesCal.toString4());
    }
}
