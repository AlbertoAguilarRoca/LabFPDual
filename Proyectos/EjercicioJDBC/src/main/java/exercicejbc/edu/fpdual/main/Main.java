package exercicejbc.edu.fpdual.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import exercicejbc.edu.fpdual.conector.Conector;
import exercicejbc.edu.fpdual.dao.Actor;
import exercicejbc.edu.fpdual.manager.ActorManager;
import exercicejbc.edu.fpdual.manager.CategoryManager;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// conectamos con la base de datos
		
		Connection con = new Conector().getMySQLConnection();
		
		try {
			//Confirmamos que el conector funciona correctamente
			//System.out.println(con.getCatalog());
			
			
			
		} finally {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}//end main

}
