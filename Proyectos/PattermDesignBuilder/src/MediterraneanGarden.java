import java.util.ArrayList;
/*
 * Clases hijas de builder con información predefinida. En este caso se la pasará
 * el diseñador de Jardines
 * */
public class MediterraneanGarden extends GardenBuilder {

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
