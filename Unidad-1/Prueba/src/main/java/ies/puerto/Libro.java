package ies.puerto;

/**
 *
 * @author Shbarroso
 */
public class Libro {
    private String titulo;
    private int anioPublicado;
    private String autor;

    /**
     * Constructor por defecto de la clase
     */
    public Libro() {}

    /**
     * Constructor con el parametro libro
     * @param titulo del libro
     */
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Constructor de la clase con el titulo y el añoPublicado
     * @param titulo del libro
     * @param anioPublicado del libro
     */
    public Libro(String titulo, int anioPublicado) {
        this.titulo = titulo;
        this.anioPublicado = anioPublicado;
    }

    /**
     * Constructor de la clase con nombre, edad y email.
     * @param titulo del libro
     * @param anioPublicado del libro
     * @param autor del libro
     */
    public Libro(String titulo, int anioPublicado, String autor) {
        this.titulo = titulo;
        this.anioPublicado = anioPublicado;
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicado() {
        return anioPublicado;
    }

    public String getAutor() {
        return autor;
    }

    /**
     * Getters/Setters del libro
     */
    public void setAnioPublicado( int anioPublicado) {
        this.anioPublicado = anioPublicado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    /**
     public void imprimirInformacion() {
      System.out.println("titulo:" +titulo);
      System.out.println("anioPublicado:" +anioPublicado);
      System.out.println("autor:" +autor);
     }
     **/
    public String imprimirInformacion() {
        String resultado ="";
        resultado = "Titulo:" +titulo+",autor:" +autor+",año:" +anioPublicado;
        return resultado;
    }

}