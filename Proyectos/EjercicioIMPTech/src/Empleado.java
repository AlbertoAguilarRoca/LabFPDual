

public class Empleado {

	private String nombre; /*nombre y apellido*/
	private String cedula;
	private int edad;
	private boolean casado;
	private double salario;
	
	/*constructores*/
	
	public Empleado() {
		this.nombre = "Nombre trabajador";
		this.cedula = "Cedula";
		this.edad = 18;
		this.casado = false;
		this.salario = 950.50;
	}
	
	public Empleado (String nombre, String cedula, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public void  clasificaEdad(int edad) {
		if(edad <= 21) {
			System.out.println("El empleado es principiante.");
		} else if (edad >= 22 && edad <= 35) {
			System.out.println("El empleado es intermedio.");
		} else {
			System.out.println("El empleado es senior.");
		}
	}
	
	public String estaCasado(boolean casado) {
		if (casado) {
			return "Casado"; 
		} else {
			return "Soltero";
		}
	}
	
	/*Tiene que ser entre 0 y 1*/
	public void aumentaSalario(double porcentaje) {
		this.salario = salario * (1 + porcentaje);
	}
	
	@Override
	public String toString() {
		return "- "+nombre+"\n- "+cedula +"\n- "+ edad +"\n- "+ estaCasado(casado) +"\n- "+ salario;
	}
	
}
