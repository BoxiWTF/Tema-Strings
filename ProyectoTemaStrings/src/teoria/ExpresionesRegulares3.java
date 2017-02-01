package teoria;

import java.util.Scanner;

public class ExpresionesRegulares3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce DNI o NIF: ");
		String cadena = in.next();
		String expresionRegular = "[\\d]{8}[TRWAGMYFPDXBNJZSQVHLCKE]?";
		if(cadena.matches(expresionRegular)) {
			System.out.printf("El DNI o el NIF is troducido es: %s%n",cadena);
		}else {
			System.out.println("No has introducido ningun DNI ni ningun NIF");
		}
		in.close();
	}

}
