import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import exercicejbc.edu.fpdual.conector.Conector;
import exercicejbc.edu.fpdual.dao.Category;
import exercicejbc.edu.fpdual.manager.CategoryManager;

@RunWith(JUnitPlatform.class)
public class CategoryManagerTest {

	private Connection con;
	private int totalRows;
	
	@BeforeEach
	public void setUp() throws SQLException, ClassNotFoundException {
		/*Preparamos el entorno para realizar pruebas*/
		con = new Conector().getMySQLConnection();
		ResultSet result = con.createStatement().executeQuery("SELECT count(*) FROM category");
		result.next();
		totalRows = result.getInt(1);
		/*Guardo en una variable la cantidad de filas que tiene la tabla*/
	}
	
	@Test
	public void findAllCategoryTest() {
		/*Validamos que existe una conexion*/
		assertNotNull(con);
		
		/*Buscamos los datos*/
		List<Category> categorias = new CategoryManager().findAllCategories(con);
		
		/*Confirmamos que la lista no sea null*/
		assertNotNull(categorias);
		
		/*Comprobamos que el tamaño es 16*/
		assertEquals(totalRows, categorias.size());
		assertEquals("Sports", categorias.get(14).getName());
		
	}
	
	@Test
	public void findCategoryByIDTest() {
		
		/*Comprobamos que el metodo retorne el valor con id que busca*/
		Category category = new CategoryManager().findCategoryByID(con, 12);
		assertEquals(12, category.getCategoryID());
		
		/*Comprobamos si, en caso de no encontrar el id, devuelve null*/
		assertNull(new CategoryManager().findCategoryByID(con, 20));
		
	}
	
	@Test
	public void insertCategoryTest() {
		Date fecha = Date.valueOf(LocalDate.now());
		new CategoryManager().insertNewCategory(con, fecha, "Hero-movies");
		
		List<Category> categorias = new CategoryManager().findAllCategories(con);
		int totalCategorias = categorias.size();
		int diferencia = totalCategorias - totalRows;
		assertEquals(1, diferencia);
	}
	
	
	@AfterEach
	public void tearDown() throws SQLException, ClassNotFoundException {
		/*Elimina todas la filas que son mayor total de tuplas inicial*/
		con = new Conector().getMySQLConnection();
		con.createStatement().executeUpdate("DELETE FROM category WHERE category_id > "
						+ totalRows);
		con.close();
	}
	
}//end test
