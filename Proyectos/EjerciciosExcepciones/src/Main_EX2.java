
public class Main_EX2 {

	public static void main(String[] args) {

		try {
			System.out.println("Imprimiendo en try");
			throw new ExDos("Lanzando la excepción.");
					
		} catch (ExDos ex) {
			System.out.println(ex.getMessage());
		}

	}

}
