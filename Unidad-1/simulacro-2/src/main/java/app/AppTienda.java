package main.java.app;

import main.java.abstractas.Producto;
import main.java.productos.Alimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTienda {
    private List<Producto> productos;

    public AppTienda() {
        productos = new ArrayList<>();
    }

    public void anadirProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto añadido correctamente.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Lista de productos:");
            for (Producto producto : productos) {
                System.out.println(producto.toString());
            }
        }
    }

    public void eliminarProducto(String udi) {
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getUdi().equals(udi)) {
                productos.remove(producto);
                encontrado = true;
                System.out.println("Producto eliminado correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún producto con el UDI especificado.");
        }
    }

    public void modificarProducto(String udi) {
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getUdi().equals(udi)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nuevo nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Nuevo precio: ");
                float precio = scanner.nextFloat();
                System.out.print("Nueva fecha de entrada: ");
                String fechaEntrada = scanner.next();
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setFechaEntrada(fechaEntrada);
                encontrado = true;
                System.out.println("Producto modificado correctamente.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún producto con el UDI especificado.");
        }
    }

    public static void main(String[] args) {
        AppTienda tienda = new AppTienda();

        // Añadir productos
        Producto alimento1 = new Alimento("Alimento1", 2.50f, "2024-01-01", "udi1");
        tienda.anadirProducto(alimento1);
        Producto alimento2 = new Alimento("Alimento2", 3.50f, "2024-01-02", "udi2");
        tienda.anadirProducto(alimento2);
        Producto alimento3 = new Alimento("Alimento3", 4.50f, "2024-01-03", "udi3");
        tienda.anadirProducto(alimento3);
        Producto alimento4 = new Alimento("Alimento4", 5.50f, "2024-01-04", "udi4");
        tienda.anadirProducto(alimento4);
        Producto alimento5 = new Alimento("Alimento5", 6.50f, "2024-01-05", "udi5");
        tienda.anadirProducto(alimento5);
        Producto alimento6 = new Alimento("Alimento6", 7.50f, "2024-01-06", "udi6");
        tienda.anadirProducto(alimento6);
        Producto alimento7 = new Alimento("Alimento7", 8.50f, "2024-01-07", "udi7");
        tienda.anadirProducto(alimento7);
        Producto alimento8 = new Alimento("Alimento8", 9.50f, "2024-01-08", "udi8");
        tienda.anadirProducto(alimento8);
        Producto alimento9 = new Alimento("Alimento9", 10.50f, "2024-01-09", "udi9");
        tienda.anadirProducto(alimento9);
        Producto alimento10 = new Alimento("Alimento10", 11.50f, "2024-01-10", "udi10");
        tienda.anadirProducto(alimento10);

        // Mostrar productos
        tienda.mostrarProductos();

        // Eliminar producto
        tienda.eliminarProducto("udi3");

        // Modificar producto
        tienda.modificarProducto("udi5");

        // Mostrar productos actualizados
        tienda.mostrarProductos();
    }
}
