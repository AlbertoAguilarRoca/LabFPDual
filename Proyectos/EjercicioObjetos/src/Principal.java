import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<String> servicios1 = new ArrayList<String>();
		servicios1.add("Consultoria");
		servicios1.add("Soporte técnico");
		servicios1.add("Blockchain");
		
		Cliente cliente = new Cliente("Google", "Servicios tecnológicos", servicios1, "20-10-2020", "paco@google.es");
		
		Empleado empleado = new Empleado("Alberto Aguilar", 850.40, "09-10-2018");
		
		Orden orden1 = new Orden("GO150", empleado, cliente, "15-07-2021", 0, servicios1.get(0));
		
		System.out.println(cliente.toString());
		System.out.println(empleado.toString());
		System.out.println(orden1.toString());
		
		orden1.updateProyecto(25);
	}

}
