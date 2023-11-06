package ies.puerto;

/**
 *
 * @author Shbarroso
 */
public class Libro {
    private String titulo;
    private int añoPublicado;
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
     * @param añoPublicado del libro
     */
    public Libro(String titulo, int añoPublicado) {
        this.titulo = titulo;
        this.añoPublicado = añoPublicado;
    }

    /**
     * Constructor de la clase con nombre, edad y email.
     * @param titulo del libro
     * @param añoPublicado del libro
     * @param autor del libro
     */
    public Libro(String titulo, int añoPublicado, String autor) {
        this.titulo = titulo;
        this.añoPublicado = añoPublicado;
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getAñoPublicado() {
        return añoPublicado;
    }

    public String getAutor() {
        return autor;
    }

    /**
     * Getters/Setters del libro
     */
    public void setAñoPublicado( int añoPublicado) {
        this.añoPublicado = añoPublicado;
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
      System.out.println("añoPublicado:" +añoPublicado);
      System.out.println("autor:" +autor);
     }
     **/
    public String imprimirInformacion() {

        return "Titulo:" + titulo + "AñoPublivado:" + añoPublicado + "Autor:" + autor;
    }

}