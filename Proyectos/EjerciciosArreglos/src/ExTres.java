
public class ExTres {

	public static int[] numerosCentro(int[] array) {
		int centro = array.length/2;
		int[] nuevoArray = new int[2];
		
		if(array.length%2 == 0) {
			/*Si el array tiene par indices*/			
			nuevoArray[0] = array[centro -1];
			nuevoArray[1] = array[centro];
			return nuevoArray;
		}
		
		return nuevoArray = null;
		
	}
	
}
