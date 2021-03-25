
public class ExSeis {

	public static void tipoTriangulo(float a, float b, float c) {
		/*creo un contador para ver cuantos lados iguales tienen*/
		int contador = 0;
		
		if(a == b) contador++;
		if(b == c) contador++;
		if(c == a) contador++;
		
		switch(contador) {
			case 3: System.out.println("Es un triángulo equilatero");
				break;
			case 1: System.out.println("Es un triángulo isósceles");
				break;
			default: System.out.println("Es un triángulo escaleno"); 
		}
	}
	
}
