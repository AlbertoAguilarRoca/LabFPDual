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
import ejemplojdbc.edu.fpdual.dao.CountryLanguage;

public class CountryLanguageManager {
	
	public List<CountryLanguage> findAllCountryLanguage(Connection con) {
		String sql = "SELECT * FROM CountryLanguage";
		try (Statement stmt = con.createStatement()){
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			
			List<CountryLanguage> language = new ArrayList<>();
			while(result.next()) {
				language.add(new CountryLanguage(result));
			}
			
			return language;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findall
	
	public List<CountryLanguage> findCountryByID(Connection con, String code) {
		String sql = "SELECT * FROM CountryLanguage WHERE CountryCode = ?";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, code);
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			List<CountryLanguage> languages = new ArrayList<>();
			
			while(result.next()) {
				languages.add(new CountryLanguage(result));
			}
			
			return languages;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end
	
	public List<CountryLanguage> findCountryByName(Connection con, String name) {
		String sql = "SELECT cl.* FROM country c, countrylanguage cl\r"
				+ "WHERE c.Code = cl.CountryCode\r"
				+ "AND c.Name = ?";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, name);
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			List<CountryLanguage> languages = new ArrayList<>();
			
			while(result.next()) {
				languages.add(new CountryLanguage(result));
			}
			
			return languages;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end
	
	public int updateCountryLanguage(Connection con, String newLanguage, String code, String language) {
		String sql = "UPDATE countryLanguage SET Language = ? WHERE CountryCode = ? AND Language = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, newLanguage);
			ps.setString(2, code);
			ps.setString(3, language);
			
			int result = ps.executeUpdate();
			
			return result;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end update
	
	public int insertNewCountryLanguage(Connection con, CountryLanguage language) {
		String sql = "INSERT INTO countryLanguage(CountryCode, Language, IsOfficial, Percentage) VALUES(?, ?, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, language.getCountryCode());
			ps.setString(2, language.getLanguage());
			ps.setBoolean(3, language.isOfficial());
			ps.setDouble(4, language.getPercentage());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end 
	
	public int deleteCountryLanguage(Connection con, String code, String language) {
		String sql = "DELETE FROM countrylanguage WHERE CountryCode = ? AND Language = ?";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, code);
			ps.setString(2, language);
			int result = ps.executeUpdate();
			return result;
		} catch(SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end
	
}//end class
