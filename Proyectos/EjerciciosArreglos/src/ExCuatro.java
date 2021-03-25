
public class ExCuatro {

	public static int[] invierteArrays(int[] array) {
		
		int[] nuevoArray = new int[array.length];
		int contador = 0;
		
		for(int i = array.length -1; i >= 0; i--) {
			nuevoArray[contador] = array[i];
			contador++;
		}
		
		return nuevoArray;
		
	}
	
}
