
public class Main_Ex5 {

	public static void main(String[] args) throws ExCinco {
		
		try {
			ExCinco.f();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

}
