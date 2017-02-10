package teoria;

import java.util.Scanner;

public class TestCuadrado {

	public static void main(String[] args) {
		System.out.println("Introduce un numero entero: ");
		Scanner in = new Scanner(System.in);
		String numeroLeido = in.next();
		in.close();
		if(numeroLeido.matches("[\\d]+")) {
			int numero = Integer.parseInt(numeroLeido);
			Cuadrado c = new Cuadrado(numero);
			System.out.println(c);
			System.out.printf("Cuadrado de arista %d, tiene como diagonal: %.2f, y de area: %d, y de perimetro: %d%n",c.getArista(),c.calcularDiagonal(),c.calcularArea(),c.calcularPerimetro());
		}else {
			System.out.println("No es un valor válido");
		}
	}

}
