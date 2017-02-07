import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Lista para aquellos nombre que comienzan por 'a'
		List<String> ListaComienzaPorA = new ArrayList<String>();
		//Lista para nombre acabados en consonantes
		List<String> ListaAcabaConsonante = new ArrayList<String>();
		//leemos los datos desde el fichero nombre_mujer.txt
		//usamos la clase scanner
		Scanner in = null;
		try {
			in = new Scanner(new File("nombres_mujer.txt"));
			int contador = 0;
			while(in.hasNextLine()) {
				String palabra = in.nextLine();
				if(palabra.startsWith("a")) {
					ListaComienzaPorA.add(palabra);
				}
				if(palabra.matches(".*[^aeiou]$")) {
					ListaAcabaConsonante.add(palabra);
				}
				contador ++;
			}
			System.out.println("El numero de palabras leidas es: "+ contador);
			System.out.println(ListaComienzaPorA);
			System.out.println(ListaAcabaConsonante);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No encuentro el archivo");
		} finally {
			in.close();
		}

	}

}
