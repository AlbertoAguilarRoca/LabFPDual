import java.util.Scanner;

public class Concatenador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String concatenador = "";
		String cadena = " ";
		System.out.println("Escribe las cadenas que quieras concatenar:\n");
		/*para dejar de concatenar pulsa ?*/
		while(!cadena.equals("?")) {
			cadena = sc.nextLine();
			if(!cadena.equals("?")) {
				concatenador += cadena;
				System.out.println(concatenador);
			}
		}

	}
	

}
