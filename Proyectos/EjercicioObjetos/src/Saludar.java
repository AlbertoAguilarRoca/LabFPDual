import java.util.Scanner;

public class Saludar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿A quién quieres saludar?\n");
		String saludo = sc.nextLine();
		
		System.out.println("Hola "+saludo);
	}

}
