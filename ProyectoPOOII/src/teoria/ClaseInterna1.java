package teoria;

public class ClaseInterna1 {
	//variable de clase e instancia
	private int variableInstancia;
	private static int variableDeClase = 10;
	//constructor
	public ClaseInterna1(int variableInstancia) {
		this.variableInstancia = variableInstancia;
	}
	//getter and setter
	public int getVariableInstancia() {
		return variableInstancia;
	}
	public void setVariableInstancia(int variableInstancia) {
		this.variableInstancia = variableInstancia;
	}
	public static int getVariableDeClase() {
		return variableDeClase;
	}
	public static void setVariableDeClase(int variableDeClase) {
		ClaseInterna1.variableDeClase = variableDeClase;
	}
	//to String
	@Override
	public String toString() {
		return "ClaseInterna1 [variableInstancia=" + variableInstancia + "]";
	}
	//clase interna 
	class Duplicador {
		private int multiplicador;
		//constructor
		public Duplicador(int multiplicador) {
			this.multiplicador = multiplicador;
		}
		//metodo
		public void cambiarVariableInstancia() {
			variableInstancia *= multiplicador;
		}
		
	}
	public void iniciarDuplicador(int multiplicador) {
		Duplicador d = new Duplicador(multiplicador);
		d.cambiarVariableInstancia();
	}
	public static class DuplicadorClase {
	}
}
