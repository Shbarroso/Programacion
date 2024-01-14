package utilidades;

/**
 * @author Shbarroso
 */
public class UtilidadesCal {
    private int num1;
    private int num2;
    public UtilidadesCal(){}

    public UtilidadesCal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicacion() {
        return num1 * num2;
    }

    public int division() {
        return num1 / num2;
    }
    public String toString1(){
        return "suma:"+suma();
    }
    public String toString2(){
        return "resta:"+resta();
    }
    public String toString3(){
        return "multiplicacion:"+multiplicacion();
    }
    public String toString4(){
        return "Division:"+division();
    }
}
