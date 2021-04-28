package ejemplojdbc.edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CountryLanguage {

	String countryCode;
	String language;
	boolean isOfficial;
	Double percentage;
	
	public CountryLanguage(ResultSet result) {
		try {
			this.countryCode = result.getString("CountryCode");
			this.language = result.getString("Language");
			this.isOfficial = result.getString("IsOfficial").equals("T");
			this.percentage = result.getDouble("Percentage");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}