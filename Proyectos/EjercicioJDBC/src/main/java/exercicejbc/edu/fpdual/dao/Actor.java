package exercicejbc.edu.fpdual.dao;

import java.sql.Date;
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
public class Actor {

	private int actorId;
	private String firstName;
	private String lastName;
	private Date lastUpdate;
	
	public Actor(ResultSet result) {
		try {
			this.actorId = result.getInt("actor_id");
			this.firstName = result.getString("first_name");
			this.lastName = result.getString("last_name");
			this.lastUpdate = result.getDate("last_update");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
