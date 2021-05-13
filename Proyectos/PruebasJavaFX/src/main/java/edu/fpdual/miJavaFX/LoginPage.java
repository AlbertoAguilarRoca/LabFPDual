package edu.fpdual.miJavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPage extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Creando el label del email and password input
		Text emailLabel = new Text("Email");
		Text passwordLabel = new Text("Contraseña");

		// Creando los inputs
		TextField emailField = new TextField();
		PasswordField passwordField = new PasswordField();

		// creando los botones
		Button submitButton = new Button("Entrar");
		Button clearButton = new Button("Borrar");

		// Creating a Grid Pane
		GridPane gridPane = new GridPane();

		// Setting size for the pane
		gridPane.setMinSize(400, 200);

		// Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		// Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5);

		// Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);

		// Arranging all the nodes in the grid
		gridPane.add(emailLabel, 0, 0);
		gridPane.add(emailField, 1, 0);
		gridPane.add(passwordLabel, 0, 1);
		gridPane.add(passwordField, 1, 1);
		gridPane.add(submitButton, 0, 2);
		gridPane.add(clearButton, 1, 2);

		// Styling nodes
		submitButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		clearButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

		emailLabel.setStyle("-fx-font: normal bold 20px 'serif' ");
		passwordLabel.setStyle("-fx-font: normal bold 20px 'serif' ");
		gridPane.setStyle("-fx-background-color: BEIGE;");

		// Creando la escena
		Scene escena = new Scene(gridPane);
		
		//Titulo de la ventana
		primaryStage.setTitle("Login Page");
		
		//Estableciendo la escena que queremos
		primaryStage.setScene(escena);
		
		//mostrando la ventana
		primaryStage.show();

	}// end start method
	
	public static void main(String args[]){ 
	      launch(args); 
	}

}
