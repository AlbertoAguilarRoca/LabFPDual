
public class ExNueve {

	public static boolean puedoDormir(boolean diaSemana, boolean vacaciones) {
		if(diaSemana && vacaciones) {
			return true;
		} else if (!diaSemana && !vacaciones) {
			return true;
		} else if (!diaSemana && vacaciones) {
			return true;
		} else return false;
	}
	
}
