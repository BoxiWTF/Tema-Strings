package teoria;

public class ExpresionesRegulares1 {

	public static void main(String[] args) {
		String cadena = "Java";
		String expresionRegular = "Java";
		System.out.printf("%s encaja con %s, %b%n",cadena,expresionRegular,cadena.matches(expresionRegular));
		expresionRegular = "java";
		System.out.printf("%s encaja con %s, %b%n",cadena,expresionRegular,cadena.matches(expresionRegular));
		//ejemplo de uno del . (cualquier caracter excepto salto de linea)
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol. mundo","hola mundo".matches("hol. mundo"));
		//añadimos es +  que significa que puede tener una o mas ocurrencias
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol.+","hola mundo".matches("hol.+"));
		//añadimos es *  que significa que puede tener 0, una o mas ocurrencias
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol.*","hola mundo".matches("hol.*"));
		//usamos [abcd], que significa que contiene alguno de esos caracteres
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol[aei] mundo","hola mundo".matches("hol[aei] mundo"));
		//uso de expresiones como [a-z]
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol[a-z] mundo","hola mundo".matches("hol[a-z] mundo"));
		//vamos a combinar los [] con * + ?
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol[a-z]+","hola mundo".matches("hol[a-z]+"));
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol[a-z]+ [a-z]+","hola mundo".matches("hol[a-z]+ [a-z]+"));
		//usamos \w
		System.out.printf("%s encaja con %s, %b%n","hola mundo","hol\\w+ \\w+","hola mundo".matches("hol\\w+ \\w+"));
	}

}
