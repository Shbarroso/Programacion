package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    String autor = "Mi autor";
    String titulo = " Mi libro";
    int anioPublicacion = 2022;
    Libro libro;

    @BeforeEach
    public void beforeEach() {
        libro = new Libro(autor, anioPublicacion, titulo);

    }

    @Test
    public void constructorTestOk() {
        Libro miLibro = new Libro(titulo, anioPublicacion, autor);
        Assertions.assertEquals(titulo, libro.getTitulo(), "No se ha obtenido el mensaje");
        Assertions.assertEquals(autor, libro.getAutor(), "No se ha obtenido el mensaje");
        Assertions.assertEquals(anioPublicacion, libro.getAnioPublicado(), "No se ha obtenido el mensaje");
    }

    @Test
    public void getTituloTestOk() {
        String miTitulo = "Otro titulo";
        libro.setTitulo(miTitulo);
        Assertions.assertEquals(miTitulo, libro.getTitulo(), "No se ha obtenido el mensaje");
    }

    @Test
    public void getAutorTestOk() {
        String miAutor = "Otros autores";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor, libro.getAutor(), "No se ha obtenido el mensaje");
    }

    @Test
    public void getAnioPublicacionTestOk() {
        int miAnioPublicacion = 2022;
        libro.setAnioPublicado(miAnioPublicacion);
        Assertions.assertEquals(miAnioPublicacion, libro.getAnioPublicado(), "No se ha obtenido el mensaje");


    }
    @Test
    public void imorimirTestOk() {
        String resultadoOk = "Titulo:" +titulo+",anioPublicacion:" +anioPublicacion+",autor:" +autor;
        Assertions.assertEquals(resultadoOk, libro.imprimirInformacion(), "No se ha obtenido el mensaje");
    }
}