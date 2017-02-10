package teoria;

import java.util.List;

// es una cla generica que tiene como atributo una coleccion parametrizada
// y va a tener un metodo que devuleve el nº de veces que se repite en la coleccion
// ademas del constructor y el to String
public class ClaseParametrizadaNueva {
	// atributo: una lista dinamica de objetos
	List <String> lista;
	// constructor, le pasamos una lista obtenida en otro programa

	public ClaseParametrizadaNueva(List<String> lista) {
		this.lista = lista;
	}
	// metodo que nos delvuelve el numero de ocurrencias
	public int calcularNumeroDeOcurrencias(String cadenaABuscar) {
		int contador = 0;
		for (String palabraDeLaLista : lista) {
			if(palabraDeLaLista.equals(cadenaABuscar)) {
				contador++;
			}
		}
		return contador;
	}
	//to String
	@Override
	public String toString() {
		return "ClaseParametrizadaNueva [lista=" + lista + "]";
	}
}
