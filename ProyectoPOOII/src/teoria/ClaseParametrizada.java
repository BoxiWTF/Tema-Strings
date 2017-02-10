package teoria;

import java.util.ArrayList;
import java.util.List;

public class ClaseParametrizada<E> {
	private List<E> lista;
	public ClaseParametrizada() {
		lista = new ArrayList<E>();
	}
	//metodo que añade un objeto
	public void addObjeto(E e) {
		lista.add(e);
	}
	//metodo que nos devuelva un elemneto por posicion
	public E getObjeto(int posicion) {
		return lista.get(posicion);
	}
}
