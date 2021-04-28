package exercicejbc.edu.fpdual.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Category {

	private int categoryID;
	private String name;
	private Date lastUpdate;
	
	public Category(ResultSet result) {
		try {
			this.categoryID = result.getInt("category_id");
			this.name = result.getString("name");
			this.lastUpdate = result.getDate("last_update");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
