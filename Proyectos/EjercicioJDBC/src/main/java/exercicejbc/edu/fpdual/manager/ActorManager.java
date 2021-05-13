package exercicejbc.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exercicejbc.edu.fpdual.dao.Actor;

public class ActorManager {
	
	public List<Actor> findAllActors(Connection con) {
		String sql = "SELECT * FROM actor";
		try(Statement stmt = con.createStatement()){
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			List<Actor> actors = new ArrayList<>();
			while(result.next()) {
				actors.add(new Actor(result));
			}
			return actors;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findactors
	
	public Actor findAnActorById(Connection con, int id) {
		String sql = "SELECT * FROM actor WHERE actor_id = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			result.beforeFirst();
			Actor actor = null;
			while(result.next()) {
				actor = new Actor(result);
			}
			return actor;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end actor
	
	public int insertNewActor(Connection con, String name, String lastName) {
		Date fechaactual = Date.valueOf(LocalDate.now());
		String sql = "INSERT INTO actor(actor_id, first_name, last_name, last_update) "
				+"VALUES(actor_id, ?, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1, name);
			ps.setString(2, lastName);
			ps.setDate(3, fechaactual);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end insert
	
	public int updateActorByID(Connection con, Actor actor, int id) {
		String sql = "UPDATE actor SET actor_id = ?, first_name = ?, last_name = ?, "
				+ "last_update = ? WHERE actor_id = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, actor.getActorId());
			ps.setString(2, actor.getFirstName());
			ps.setString(3, actor.getLastName());
			ps.setDate(4, actor.getLastUpdate());
			ps.setInt(5, id);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//update
	
	public int deleteActorById(Connection con, int id) {
		String sql = "DELETE FROM actor WHERE actor_id = ?";
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
}
