package teoria;
//para comprobar si los argumentos o parametros se pasan por valor (una copia) o por referencia (la posicion de memoria)
public class ReferenciaValor {

	public static void main(String[] args) {
		//con datos primitivos
		int variablePrimitiva = 5;
		System.out.println("El valor de la variable en el main antes de llamar al metodo " + variablePrimitiva );
		cambiarValores(variablePrimitiva);
		System.out.println("El valor de la variable en el main despues de llamar al metodo " + variablePrimitiva );
		//con objetos
		String objeto1 = new String("Hello World");
		System.out.println("El valor del objeto en el main antes de llamar al metodo es: " + objeto1 );
		cambiarValores(objeto1);
		System.out.println("El valor del objeto en el main despues de llamar al metodo es: " + objeto1 );
	}
	
	public static void cambiarValores(int variablePrimitiva) {
		variablePrimitiva *= 2;
		System.out.println("El valor de la variable en el metodo " + variablePrimitiva );
	}
	
	public static void cambiarValores(String variableObjeto) {
		variableObjeto += variableObjeto;
		System.out.println("El valor del objeto en el metodo es: "+variableObjeto);
	}
}
