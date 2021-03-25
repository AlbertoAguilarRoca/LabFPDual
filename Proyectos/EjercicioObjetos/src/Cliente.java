import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	/*Atributos*/
	private String nombreCliente;
	private String actividad;
	private ArrayList<String> serviciosContratados;
	private String fechaContratacion;
	private String contacto;
	
	/*constructor*/
	
	public Cliente(String nombreCliente, String actividad, ArrayList<String> serviciosContratados,
			String fechaContratacion, String contacto) {
		this.nombreCliente = nombreCliente;
		this.actividad = actividad;
		this.serviciosContratados = serviciosContratados;
		this.fechaContratacion = fechaContratacion;
		this.contacto = contacto;
	}
	
	/*metodos*/

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public void setServiciosContratados(ArrayList<String> serviciosContratados) {
		this.serviciosContratados = serviciosContratados;
	}
	
	public void addService(String nuevoServicio) {
		this.serviciosContratados.add(nuevoServicio);
	}
	
	public void removeService(ArrayList<String> serviciosContratados) {
		getServiciosContratados(serviciosContratados);
		System.out.println("¿Qué servicio desea borrar?");
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		this.serviciosContratados.remove(numero - 1);
	}
	
	public void getServiciosContratados(ArrayList<String> array) {
		int n = 1;
		for(String i: array) {
			System.out.println(n+" - "+i);
			n++;
		}
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(String fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@Override
	public String toString() {
		return nombreCliente + ", " + actividad + ", "
				+ serviciosContratados + ", " + fechaContratacion + ", " + contacto + ".";
	}
	
	
	
}
