package teoria;

import java.util.Scanner;

/* con este programa vamos a leer
 * datos desde la consola
 * usando la clase escaner
 * y comprobamos que el tipo es correcto
 */

public class ExpresionesRegulares2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//leemos u numero entero pero como cadena
		System.out.println("Introduce un entero: ");
		String numeroleido = in.next();
		String expresionRegular = "[0-9]+";
		//convertimos la cadena a numero
		if(numeroleido.matches(expresionRegular)) {
			int numero = Integer.parseInt(numeroleido);
			System.out.printf("El numero introducido es %d%n",numero);
		}else {
			System.out.println("No has introdicido un numero entero");
		}
		System.out.println("Introduce solo una palabra");
		String palabra = in.next();
		expresionRegular = "[a-zA-Z]+";
		if(palabra.matches(expresionRegular)) {
			System.out.printf("La palabra introudicda es %s%n",palabra);
		}else {
			System.out.println("No has introducido una palabra");
		}
		in.close();
	}

}
