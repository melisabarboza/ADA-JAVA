package collection.inicial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AppCollection {

	// generar una lista y agregar valores, ejecutar metodos add, size y remove
	// generar un conjunto y agregar valores, ejecutar metodos add, size y remove

	public static void main(String[] args) {
		// pruebaListas();
		pruebaSet();
		// compraFrutasList();
		// conjuntoAlmacen();
		// listaMaquillajes();
	}

	private static void listaMaquillajes() {
		List<String> maquillajes = new ArrayList<String>();
		System.out.println(maquillajes.size());
		maquillajes.add("rubor");
		maquillajes.add("labial gloss");
		maquillajes.add("lapiz");
		System.out.println(maquillajes);

		System.out.println("Comienzo bucle...");
		for (int i = 0; i < maquillajes.size(); i++) {
			String item = maquillajes.get(i);
			System.out.println(item);
		}

		System.out.println("for sin indice...");
		for (String pos : maquillajes) {
			System.out.println(pos);
		}

		System.out.println("function lambda (arrow function)...");
		maquillajes.forEach(x -> {
			System.out.println(x);
		});
	}

	private static void compraFrutasList() {

		List<String> listaFrutas = new ArrayList<String>();

		listaFrutas.add("Manzana");
		listaFrutas.add("Banana");
		System.out.println("size: " + listaFrutas.size());
		System.out.println(listaFrutas);

		listaFrutas.remove(1);
		System.out.println("size: " + listaFrutas.size());
		System.out.println(listaFrutas);

	}

	private static void conjuntoAlmacen() {

		Set<String> conjuntoAlmacen = new HashSet<String>();
		System.out.println("size: " + conjuntoAlmacen.size());
		conjuntoAlmacen.add("Arroz");
		conjuntoAlmacen.add("Fideos");
		System.out.println("size: " + conjuntoAlmacen.size());
		conjuntoAlmacen.add("Fideos"); // si se repite el objeto no lo agrega
		System.out.println("size: " + conjuntoAlmacen.size());
	}

	private static void pruebaSet() {
		Set<String> conj = new HashSet<String>();
		System.out.println("Conjuntos: ");
		System.out.println("size: " + conj.size());
		conj.add("20-37866903-6");
		conj.add("20-37866903-7");
		System.out.println("size: " + conj.size());
		conj.add("20-37866903-6"); // si se repite el objeto no lo agrega
		System.out.println("size: " + conj.size());

		System.out.println("Iterator ... ");
		Iterator<String> it = conj.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Foreach ... ");
		conj.forEach(elem -> System.out.println(elem));
	}

	private static void pruebaListas() {
		List<String> lista = new ArrayList<String>();
		System.out.println("size: " + lista.size());

		lista.add("elemento1");
		lista.add("elemento2");
		System.out.println("size: " + lista.size());
		System.out.println(lista);

		lista.remove(0);
		System.out.println("size: " + lista.size());
		System.out.println(lista);

		List<String> lista2 = new ArrayList<String>();
		lista2.add("item1");
		lista2.add("item2");
		lista.addAll(lista2);
		System.out.println(lista);

		System.out.println("Comienzo bucle...");
		for (int i = 0; i < lista.size(); i++) {
			String item = lista.get(i);
			System.out.println(item);
		}

		System.out.println("for sin indice...");
		for (String pos : lista) {
			System.out.println(pos);
		}

		System.out.println("function lambda (arrow function)...");
		lista.forEach(x -> {
			System.out.println(x);
		});

//		lista.stream().filter(predicate)

	}
}