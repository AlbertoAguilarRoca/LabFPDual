/**
 * 
 */
package ejercicionesEnum;

/**
 * @author alberto.aguilar.roca
 *
 */


public enum Planeta {

	/*(orbita en cinturon de asteroides, tiene atmósfera, 
	 * distancia al sol medido en ua)*/
	
	MERCURIO(true, false, 0.39),
	VENUS(true, true, 0.72),
	TIERRA(true, true, 1.00),
	MARTE(true, true, 1.52),
	JUPITER(false, true, 5.20),
	SATURNO(false, true, 9.54),
	URANO(false, true, 19.19),
	NEPTUNO(false, true, 30.06);
	
	
	private boolean orbitaAsteroides;
	private boolean tieneAtmosfera;	
	private double distanciaSol;
	
	private Planeta(boolean orbitaAsteroides, boolean tieneAtmosfera, double distanciaSol) {
		this.orbitaAsteroides = orbitaAsteroides;
		this.tieneAtmosfera= tieneAtmosfera;
		this.distanciaSol= distanciaSol;
	}
	
	public double distanceFromSun(double ua) {
		long distancia = (long) ua*149597870;
		return distancia;
	}

	public boolean isOrbitaAsteroides() {
		return orbitaAsteroides;
	}

	public boolean isTieneAtmosfera() {
		return tieneAtmosfera;
	}

	public double getDistanciaSol() {
		return distanciaSol;
	}

	
}//end class
