package teoria;

public class Cuadrado {
	//atributos
	private int arista;
	private static int numeroCuadrados = 0;
	//constructor
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroCuadrados++;
	}
	public Cuadrado() {
		this.arista=1;
		numeroCuadrados++;
	}
	//getter and setter
	public int getArista() {
		return arista;
	}
	public void setArista(int arista) {
		this.arista = arista;
	}
	public static int getNumeroCuadrados() {
		return numeroCuadrados;
	}
	//metodos
	public int calcularArea() {
		return arista*arista;
	}
	public int calcularPerimetro() {
		return arista*4;
	}
	public double calcularDiagonal() {
		return arista*Math.sqrt(2);
	}
	@Override
	public String toString() {
		return "Cuadrado [arista=" + arista + "]";
	}
	
}
