package teoria;

public class ContextoEstaticoInstancia {
	int variableInstancia = 5;
	static int variableDeClase = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int variableLocal = 7;
		metodoDeClase();
		//metodoInstancia();
		
	}
	
	public void metodoInstancia() {
		int variableLocal2 = 8;
		System.out.println("Intentando acceder a variableInstancia: " + variableInstancia);
		System.out.println("Intentando acceder a variableDeClase: " + variableDeClase);
		System.out.println("Intentando acceder a variableLocal: " + variableLocal2);
		//System.out.println("Intentando acceder a variableLocal: " + variableLocal);
	}
	public static void metodoDeClase() {
		int variableLocal3 = 9;
		//System.out.println("Intentando acceder a variableInstancia: " + variableInstancia);
		System.out.println("Intentando acceder a variableDeClase: " + variableDeClase);
		//System.out.println("Intentando acceder a variableLocal2: " + variableLocal2);
		//System.out.println("Intentando acceder a variableLocal: " + variableLocal);
		System.out.println("Intentando acceder a variableLocal3: " + variableLocal3);
		
	}
}
