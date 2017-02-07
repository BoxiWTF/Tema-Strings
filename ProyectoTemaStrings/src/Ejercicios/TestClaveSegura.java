package Ejercicios;

public class TestClaveSegura {

	public static void main(String[] args) {
		final String Fuente_caracteres = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNñNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
		//generamos el tamaño de la clave
		int tamanio = (int) (Math.random()* Fuente_caracteres.length());
		System.out.println("La longitud de la clave es: "+tamanio);
		//generamos la clave 
		String clave = "";
		for (int i = 0; i < tamanio; i++) {
			int posicion = (int) (Math.random()* Fuente_caracteres.length());
			clave += Fuente_caracteres.charAt(posicion);
		}
		System.out.println("La clave es: "+ clave);
		ClaveSegura clave_final = new ClaveSegura(clave);
		System.out.printf("La clave '%s' es segura: %b%n",clave_final,clave_final.esClaveSegura());
	}

}
