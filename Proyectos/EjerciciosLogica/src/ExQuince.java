
public class ExQuince {

	public static void sumaParametros(String par1, String par2, String par3) {
		int sumatorio = 0;
		
		for(int i = 0; i < par1.length(); i++) {
			if(par1.charAt(i) < 48 || par1.charAt(i) > 57) {
				System.out.println("El parámetro "+par1+ " contiene valores no númericos.");
			} else {
				sumatorio += Character.getNumericValue(par1.charAt(i));
			}		
		}
		
		for(int k = 0; k < par2.length(); k++) {
			if(par2.charAt(k) < 48 || par2.charAt(k) > 57) {
				System.out.println("El parámetro "+par2+ " contiene valores no númericos.");
			} else {
				sumatorio += Character.getNumericValue(par2.charAt(k));
			}		
		}
		
		for(int j = 0; j < par3.length(); j++) {
			if(par3.charAt(j) < 48 || par3.charAt(j) > 57) {
				System.out.println("El parámetro "+par3+ " contiene valores no númericos.");
			} else {
				sumatorio += Character.getNumericValue(par3.charAt(j));
			}		
		}
		
		System.out.println("El sumatorio de todos los parámetros es: "+sumatorio);
		
	}//end function
	
}
