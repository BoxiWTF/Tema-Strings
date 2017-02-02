package Ejercicios;

import java.util.Iterator;

public class PalabraLeida {
	//atributo
	private String contenidoPalabra;
	//constructor
	public PalabraLeida(String contenidoPalabra) {
		this.contenidoPalabra = contenidoPalabra;
	}
	//to String
	@Override
	public String toString() {
		return "PalabraLeida [contenidoPalabra=" + contenidoPalabra + "]";
	}
	//metodos
	public int contarNumeroLetras() {
		return contenidoPalabra.length();
	}
	public boolean empiezaPorVocal() {
		return contenidoPalabra.matches("[aeiouáéíóúAEIOUÁÉÍÓÚ].*");
	}
	public boolean terminaPorVocal() {
		return contenidoPalabra.matches(".*[aeiouáéíóúAEIOUÁÉÍÓÚ]");
	}
	public int contarNumeroVocales() {
		int contador = 0;
		for (int i = 0; i < contenidoPalabra.length(); i++) {
			if((""+contenidoPalabra.charAt(i)).matches("[aeiouáéíóúAEIOUÁÉÍÓÚüÜ]")){
				contador++;
			}
		}
		return contador;
	}
	public boolean contieneH() {
		return contenidoPalabra.contains("[hH]");
	}
	public boolean sonIguales(String palabra) {
		return contenidoPalabra.equals(palabra);
	}
	public boolean esPalindromo() {
		StringBuilder sBuilder = new StringBuilder(contenidoPalabra);
		String palabraAlReves = sBuilder.reverse().toString();
		return contenidoPalabra.matches(palabraAlReves);
	}
}
