package Ejercicios;

public class ClaveSegura {
	private String clave;
	//constructor
	public ClaveSegura(String clave) {
		if(esClaveSegura()) {
			this.clave = clave;
		}else {
			throw new RuntimeException("No es clave segura");
		}
	}
	//to String
	@Override
	public String toString() {
		return clave;
	}
	//metodo
	public boolean esClaveSegura() {
		boolean cumple = false;
		if((clave.length()>= 8) && (clave.matches(".*[a-z].*")) && (clave.matches(".*[A-Z].*")) && (clave.matches(".*[0-9].*")) && (clave.matches(".*[\\W_].*"))) {
			cumple = true;
		}
		return cumple;
	}
}
