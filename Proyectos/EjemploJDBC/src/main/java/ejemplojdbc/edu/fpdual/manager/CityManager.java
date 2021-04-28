package ejemplojdbc.edu.fpdual.manager;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;

/**
 * City DTO Manager.
 * 
 * Contains all the queries used to consult and manipulate Cities data.
 * 
 * @author jose.m.prieto.villar
 *
 */
public class CityManager {

	/**
	 * Finds all the cities in the DB
	 * 
	 * @param con DB connection
	 * @return a {@link List} of {@link City}
	 */
	public List<City> findAll(Connection con) {
		//Create general statement
		try (Statement stmt = con.createStatement()) {
			//Queries the DB
			ResultSet result = stmt.executeQuery("SELECT * FROM City WHERE Name LIKE 'Sev%'");
			//Set before first registry before going through it.
			result.beforeFirst();

			//Initializes variables
			List<City> cities = new ArrayList<>();
			Map<Integer, String> countries = new HashMap();

			//Run through each result
			while (result.next()) {
				//Initializes a city per result
				cities.add(new City(result));
				//Groups the countried by city
				countries.put(result.getInt("ID"), result.getString("CountryCode"));
			}

			//Fills the country of each city
			fillCountries(con, countries, cities);

			return cities;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Fills all the countries for each city.
	 * @param con the Db connection
	 * @param countries the map of cities and countries.
	 * @param cities the list of cities to update.
	 */
	private void fillCountries(Connection con, Map<Integer, String> countries, List<City> cities) {
		// Obtains all the country codes to search
		Set<String> countryCodes = new HashSet<>(countries.values());

		 // Looks for all countries and groups them by id.
		Map<String, String> countriesMap = new HashMap<>();

		 List<String> countriesFound = new CountryManager().findAllById(con, countryCodes);

		 for (String country : countriesFound) {
		countriesMap.put(country, country);
		}

		 // Associates the corresponding Country to each City

		 for (City city : cities) {
		String countryCode = countries.get(city.getId());
		String foundCountry = countriesMap.get(countryCode);
		city.setCountry(foundCountry);
		};

	}

	/*Buscar por ID de ciudad*/
	public City findByID(Connection con, int idCity) {
		try(PreparedStatement pS = con.prepareStatement("SELECT * FROM City WHERE ID = ?")) {
			pS.setInt(1, idCity);
			ResultSet result = pS.executeQuery();
			result.beforeFirst();

			City ciudades = null;
			
			if(result.next()) {
				ciudades = new City(result);
			}
					
			return ciudades;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findbyID
	
	/*Filtrar ciudades ciudades*/
	
	public City filterbyName(Connection con, String cityName) {
		
		String sql = "SELECT * FROM city WHERE Name = ?";
		
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, cityName);
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			/*Inicializamos la variable a null*/
			City ciudades = null;			
			if (result.next()) {
				ciudades = new City(result);
				/*como solo esperamos un resultado, hacemos un if y retornamos un objeto City*/
			}
						
			return ciudades;
 			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}//end filterByName
	
	/*Devuelve una lista de ciudades que empiezan por una cadena*/
	public List<City> startByString(Connection con, String cadena) {
		
		String sql = "SELECT * FROM city WHERE Name LIKE ?";
		
		try (PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setString(1, cadena+"%");
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			
			List<City> cities = new ArrayList<City>();
			while(result.next()) {
				cities.add(new City(result));
			}
			
			return cities;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}//end starByString
	
	/*Devuelve una lista de ciudades que acaban por una cadena*/
	public List<City> endByString(Connection con, String cadena) {
		
		String sql = "SELECT * FROM city WHERE Name LIKE ?";
		
		try (PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setString(1, "%"+cadena);
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			
			List<City> cities = new ArrayList<City>();
			
			while(result.next()) {
				cities.add(new City(result));
			}
			
			return cities;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}//end endByString

	/*Actualiza una ciudad por ID*/
	public int updateCity(Connection con, String cadena, int id) {
		String sql = "UPDATE city SET Name = ? WHERE ID = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, cadena);
			ps.setInt(2, id);
			
			return ps.executeUpdate();
						
		} catch(SQLException e) {
			System.out.println("El error es: "+e.getMessage());
			return 0;
		}
	}//end update by ID
	
	/*Insertar una nueva ciudad*/
	public int insertCity(Connection con, String name, String countrycode, String district, BigDecimal population) {
		String sql = "INSERT INTO city (ID,Name, CountryCode, District, Population) VALUES ( ID, ?, ?, ?, ?)";
		
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, countrycode);
			ps.setString(3, district);
			ps.setBigDecimal(4, population);
			
			int result = ps.executeUpdate();
			return result;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	/*Borrar una ciudad por ID*/
	public int deleteCitybyID(Connection con, int id) {
		String sql = "DELETE FROM city WHERE ID = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end borrar
	
	
}