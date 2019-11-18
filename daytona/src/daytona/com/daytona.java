package daytona.com;

public class daytona {
	
	private static String veredicto (String valor1, String valor2) {
		
	if (valor1.equals(valor2)) {
	    return "Perfecto. Has tenido buen criterio.";
	}
	if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
	    return "Has mejorado, o te ha llegado el éxito inesperado.";
	}
	return "Te has confiado. Falta realismo.";	
	
	/*Este metodo nos permite comparar los valores de los argumentos que
	 hemos intruducido, y devuelve un mensaje acorde al resultado*/
	
	}

	public static void main (String args[]) {
		
		System.out.println("La calificación de " + args[0] + " : ");
		System.out.println(veredicto(args[1],args[2]));
		
	
	
	
	}
}
