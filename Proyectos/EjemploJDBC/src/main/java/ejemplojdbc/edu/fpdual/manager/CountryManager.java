package ejemplojdbc.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;

/**
 * Country DTO Manager.
 * 
 * Contains all the queries used to consult and manipulate Countries data.
 * 
 * @author jose.m.prieto.villar
 *
 */
public class CountryManager {

	/**
	 * Finds all the cities in the DB based on a list of ids.
	 * 
	 * @param con DB connection
	 * @param ids Countries id set to search for.
	 * @return a {@link List} of {@link Country}
	 */
	public List<String> findAllById(Connection con, Set<String> ids) {
		//Creates the SQL command
		String sql = String.format("SELECT * FROM Country WHERE Code in (%s)",
				ids.stream().map(data -> "\"" + data + "\"").collect(Collectors.joining(", ")));

		//Create a prepared statement
		try (Statement stmt = con.createStatement()) {

			//Executes sql command
			ResultSet result = stmt.executeQuery(sql);
			//Set before first registry before going through it.
			result.beforeFirst();

			//Initializes variables
			List<String> countries = new ArrayList<>();

			//Run through each result
			while (result.next()) {
				//Initializes a country per result
				countries.add(new Country(result).getCode());
			}

			return countries;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end find all by id
	
	/*Encuentra todos los paises*/
	public List<Country> findAllCountries(Connection con) {
		String sql = "SELECT * FROM country";
		try (Statement stmt = con.createStatement()) {
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			List<Country> countries = new ArrayList<>();
			
			while(result.next()) {
				countries.add(new Country(result));
			}
			
			return countries;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findallcountries
	
	/*encuntra un pais por el codigo*/
	
	public Country findCountryByCode(Connection con, String code) {
		String sql = "SELECT * FROM country WHERE Code = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, code);
			ResultSet result = ps.executeQuery();
			
			Country country = null;
			if(result.next()) {
				country = new Country(result);
			}
			
			return country;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findbyName
	
	/*Contenga un pais como parametro*/
	
	public Country findCountryByName(Connection con, String countryName) {
		String sql = "SELECT * FROM country WHERE Name = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, countryName);
			ResultSet result = ps.executeQuery();
			
			Country country = null;
			if(result.next()) {
				country = new Country(result);
			}
			
			return country;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findbyName
	
	/*Paises que empiecen por una cadena*/
	public List<Country> countryWhichStartBy(Connection con, String cadena){
		
		String sql = "SELECT * FROM country WHERE Name LIKE ?";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, cadena+"%");
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			
			List<Country> countries = new ArrayList<>();
			while(result.next()) {
				countries.add(new Country(result));
			}
			
			return countries;			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}//end countrystartby
	
	/*Paises que empiecen por una cadena*/
	public List<Country> countryWhichEndBy(Connection con, String cadena){
		
		String sql = "SELECT * FROM country WHERE Name LIKE ?";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, "%"+cadena);
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			
			List<Country> countries = new ArrayList<>();
			while(result.next()) {
				countries.add(new Country(result));
			}
			
			return countries;			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}//end countryendby
	
	/*Actualizar un dato de un pais*/
	public int updateCountrybyCountryCode(Connection con, String upData, String data, String code) {
		String sql = "UPDATE country SET "+upData+"= ? WHERE Code = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, data);
			ps.setString(2, code);
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end update
	
	public int insertNewCountry(Connection con, String code, String name, String continent) {
		String sql = "INSERT INTO country"
				+ "(Code, Name, Continent) "
				+ "VALUES(?, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, code);
			ps.setString(2, name);
			ps.setString(3, continent);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end 
	
	public int deleteCountryByCode(Connection con, String code) {
		String sql = "DELETE FROM country WHERE Code = ?";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, code);
			int result = ps.executeUpdate();
			return result;
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end
	
}//end DAO class