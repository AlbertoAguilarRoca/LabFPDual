
public class ExCinco {

	public static void depuraParametro(String par1, String par2, String par3) {
		
		if(esPar(par1)) {
			System.out.println(par1+" es par");
		} else {
			System.out.println(par1+" es Impar");
		}
		
		if(esPar(par2)) {
			System.out.println(par2+" es par");
		} else {
			System.out.println(par2+" es Impar");
		}
		
		if(esPar(par3)) {
			System.out.println(par3+" es par");
		} else {
			System.out.println(par3+" es Impar");
		}
		
	}
	
	/*recibe un parametro, si es par devuelve true*/
	public static boolean esPar(String parametro) {
		int contador = 0;
		for (int i = 0; i < parametro.length(); i++) {
			contador ++;
		}
		
		if(contador%2==0) return true;
		else return false;		
	}
	
}
