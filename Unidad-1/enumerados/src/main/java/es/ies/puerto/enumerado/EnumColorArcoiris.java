package es.ies.puerto.enumerado;

public enum EnumColorArcoiris {
    ROJO("Rojo"),
    NARANJA("Naranja"),
    AMARILLO("Amarillo"),
    VERDE,
    AZUL;
    private EnumColorArcoiris(){
    }
    private  String color;
    private EnumColorArcoiris(final String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
