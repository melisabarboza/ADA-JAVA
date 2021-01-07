package inicio.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class PantallaProductos {

	public static void Bienvenida() {
		System.out.println("Bienvenido al shop online de tienda Perrito");
		System.out.println();
		System.out.println("Productos en venta: collares, pretales, pipetas, seresto, antiparacitarios");

		List<Producto> productos = obtenerListaDeProductos();

		for (int i = 0; i < productos.size(); i++) {
			Producto prod = productos.get(i);
			System.out.println("id: " + prod.id);
			System.out.println("nombre: " + prod.nombre);
			System.out.println("precio:" + prod.precio);
		}

		// permitir al usuario seleccionar un producto
		System.out.println("Para comprar seleccione el producto deseado y añada al carrito");
		// permitir al usuario indicar si quiere comprar un producto o salir
		// si quiere comprar: permitir al usuarioingresar codigo de producto y cantidad
		// mostrar precio total del carrito

	}

	private static List<Producto> obtenerListaDeProductos() {
		List<Producto> productos = new ArrayList<Producto>();
		Producto collar = new Producto(1, "collar", 35);
		productos.add(collar);
		Producto pipeta = new Producto(2, "pipeta", 500);
		productos.add(pipeta);
		Producto pretal = new Producto(3, "pretal", 100);
		productos.add(pretal);
		return productos;
	}

}