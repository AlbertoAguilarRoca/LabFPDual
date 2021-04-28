package ejemplojdbc.edu.fpdual.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

import ejemplojdbc.edu.fpdual.conector.Conector;
import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;
import ejemplojdbc.edu.fpdual.dao.CountryLanguage;
import ejemplojdbc.edu.fpdual.manager.CityManager;
import ejemplojdbc.edu.fpdual.manager.CountryLanguageManager;
import ejemplojdbc.edu.fpdual.manager.CountryManager;

public class Main {

	public static void main(String[] args) {
		// Connects to the DB
		try (Connection con = new Conector().getMySQLConnection()) {
			// Looks for all the cities in the DB and prints them.
			 //new CityManager().findAll(con).forEach(city ->System.out.println(city));
			//System.out.println(con.getCatalog());

			//CountryLanguage andalusia = new CountryLanguage("ESP", "Andalú", true, 17.9);
			new CountryLanguageManager().deleteCountryLanguage(con, "ESP", "Andalú");
			new CountryLanguageManager().findCountryByID(con, "ESP").forEach(country -> System.out.println(country));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
