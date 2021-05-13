import java.util.ArrayList;

public class ClasicGarden extends GardenBuilder {

	@Override
	public void plantarArboles(ArrayList<String> arboles) {
		jardin.setArboles(arboles);
	}

	@Override
	public void plantarFlores(ArrayList<String> flores) {
		jardin.setFlores(flores);
	}

	@Override
	public void echarAbono() {
		System.out.println("Abono echado por el jardinero.");
		
	}

	@Override
	public void instalarFuente(boolean tieneFuente) {
		jardin.setTieneFuente(tieneFuente);
	}


}
