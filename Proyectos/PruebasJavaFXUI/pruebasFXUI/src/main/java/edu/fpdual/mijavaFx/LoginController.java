package edu.fpdual.mijavaFx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {
	
	public LoginController() {
		
	}

	@FXML
	private TextField userName;
	@FXML
	private PasswordField userPassword;
	@FXML
	private Button loginButton;
	@FXML
	private Label ErrorMessage;
	
	@FXML
	public void userLogIn() throws IOException {
		checkUserLog();
	}
	
	@FXML
	public void checkUserLog() throws IOException {
		if(userName.getText().isEmpty() || userPassword.getText().isEmpty()) {
			ErrorMessage.setText("Uno de los campos está vacío");
		} else if(!userName.getText().equals("AlbertoAguilar") 
				&& !userPassword.getText().equals("contraseña1")) {
			ErrorMessage.setText("El Usuario/Contraseña introducido es incorrecto");
		} else {
			App.setRoot("primary");
		}
	}
	
}
