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

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import exercicejbc.edu.fpdual.dao.Category;

public class CategoryManager {

	public List<Category> findAllCategories(Connection con) {
		
		String sql = "SELECT * FROM category";
		try (Statement stmt = con.createStatement()){
			ResultSet result = stmt.executeQuery(sql);
			result.beforeFirst();
			
			List<Category> categories = new ArrayList<>();
			while(result.next()) {
				categories.add(new Category(result));
			}
			return categories;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}//end findallcategories
	
	public Category findCategoryByID(Connection con, int id) {
		String sql = "SELECT * FROM category WHERE category_id = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			Category category = null;
			if(result.next()) {
				category = new Category(result);
			}
			
			return category;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}//end findBycategory
	
	public int insertNewCategory(Connection con, Date fecha, String name) {
		String sql = "INSERT INTO category (category_id, last_update, name) "
				+"VALUES(category_id, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setDate(1, fecha);
			ps.setString(2, name);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//end insert
	
	public int updateCategorybyID(Connection con, int newId, String name, Date fecha, int id) {
		String sql = "UPDATE category SET category_id = ?, name = ?, last_update = ? "
				+"WHERE category_id = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, newId);
			ps.setString(2, name);
			ps.setDate(3, fecha);
			ps.setInt(4, id);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//insert
	
	public int deleteCategoryById(Connection con, int id) {
		String sql = "DELETE FROM category WHERE category_id = ?";
		try (PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}//delete
	
}
