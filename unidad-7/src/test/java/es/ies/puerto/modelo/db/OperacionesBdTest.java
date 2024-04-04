package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/usuarios.db";
    String MESSAGE_ERROR = "NO SE OBTENIDO EL RESULTADO ESPERADO";
    @BeforeEach
    public void beforeEach() {
        operacionesBd = new OperacionesBd(urlBd);
    }
    @Test
    public void obtenerUsuariosAllTest() {
        try {
            set<Usuario> lista = operacionesBd.obtenerUsuarios();
            Assertions.assertEquals(10,lista.size(), MESSAGE_ERROR);
            operacionesBd.obtenerUsuarios();
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuariosTest() {
        Usuario usuario = new Usuario("5");
        try {
            usuario = operacionesBd.obtenerUsuario();
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getEdad(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getCiudad(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarUsuariosTest() {
        Usuario usuario = new Usuario("5", 20, "pepe", "miciudad");
        try {
            usuario = operacionesBd.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

}
