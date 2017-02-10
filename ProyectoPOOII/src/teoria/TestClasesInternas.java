package teoria;

public class TestClasesInternas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseInterna1 c1 = new ClaseInterna1(12);
		c1.setVariableInstancia(13); //Modificamso su valor
		c1.setVariableDeClase(11); //modificamos la de clase
		ClaseInterna1.setVariableDeClase(111); //modificamos la de clase de otra forma
		System.out.println("Imprimo la referencia: "+c1);
		System.out.println("Valor de la variable de clase: "+ ClaseInterna1.getVariableDeClase());
		System.out.println("Valor de la variable de instancia: "+ c1.getVariableInstancia());
		//ClaseInterna1.Duplicador cD = c1.(new Duplicador(3)));
		c1.iniciarDuplicador(3);
		System.out.println("Imprimo la referencia: "+c1);
	}

}
