package es.ies.puerto.modelo;

public class Usuario extends Persona{

    public Usuario(String id){
        super(id);
    }
    public Usuario(String id, int edad, String nombre, String ciudad) {
        super(id, edad, nombre, ciudad);
    }
}
