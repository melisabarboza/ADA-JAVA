package inicio.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {

	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() >= tope) {
			lista.add((T) objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	public Iterator iterator() {
		return lista.iterator();
	}
}
