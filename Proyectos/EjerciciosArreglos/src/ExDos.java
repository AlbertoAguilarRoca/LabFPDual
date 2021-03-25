
public class ExDos {

	public static boolean contieneNumeros(int[] array) {
		for(int i=0; i < array.length; i++) {
			if(array[i] == 2 || array[i] == 3) {
				return false;
			} 
		}
		
		return true;
	}
	
}
