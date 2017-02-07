package Ejercicios;

import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		System.out.println("Introduce una palabra: ");
		Scanner in = new Scanner(System.in);
		String palabra = in.next();
		PalabraLeida p = new PalabraLeida(palabra);
		System.out.printf("%s tiene %d letras%n",p,p.contarNumeroLetras());
		System.out.printf("%s empieza por vocal: %b y acaba por vocal: %b%n",p,p.empiezaPorVocal(),p.terminaPorVocal());
		System.out.printf("%s tiene %d vocales%n",p,p.contarNumeroVocales());
		System.out.printf("%s contiene h o H: %b%n",p,p.contieneH());
		System.out.printf("%s es palindromo: %b%n",p,p.esPalindromo());
		System.out.printf("%s es igual a %s: %b%n",p,"BichoBola",p.sonIguales("BichoBola"));
		in.close();
	}

}
