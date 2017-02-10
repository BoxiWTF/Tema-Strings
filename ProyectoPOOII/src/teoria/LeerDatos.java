package teoria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LeerDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<>(); //creo la lista vacia
		try {
			Scanner in = new Scanner(new File("constitucion.txt"));
			while(in.hasNext()) {
				lista.add(in.next().toLowerCase());
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(lista);
		//System.out.println("nº de palabras leidas: "+ lista.size());
		ClaseParametrizadaNueva cP = new ClaseParametrizadaNueva(lista);
		//System.out.println(cP);
		System.out.printf("En la constitucion la palabra %s se repite %d veces","a",cP.calcularNumeroDeOcurrencias("a"));
	}

}
