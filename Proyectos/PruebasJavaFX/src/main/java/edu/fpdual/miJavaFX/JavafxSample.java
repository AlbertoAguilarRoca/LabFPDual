package edu.fpdual.miJavaFX;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavafxSample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		//Creando el objeto
		Circle circulo = new Circle(300, 135, 100);
		Text texto = new Text("Clica en el círculo para cambiar el color: ");
		
		//Estableciendo estilos
		texto.setX(15);
		texto.setY(15);
		texto.setFont(Font.font("Lato", FontWeight.BOLD, 16));
		texto.setFill(Color.BLUEVIOLET);
		circulo.setFill(Color.DEEPSKYBLUE);
		
		//Creando el evento
		EventHandler<MouseEvent> eventoRaton = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				//Nuevas funcionalidades del circulo
				circulo.setFill(Color.YELLOW);
				circulo.setRadius(50);				
			}
			
		};
		
		//Registrando el evento en el circulo
		circulo.addEventFilter(MouseEvent.MOUSE_CLICKED, eventoRaton);

		Group root = new Group();

		// Retrieving the observable list object
		ObservableList<Node> listaHijos = root.getChildren();

		// Setting the text object as a node to the group object
		listaHijos.add(texto);
		listaHijos.add(circulo);

		Scene scene = new Scene(root, 600, 300);

		primaryStage.setTitle("Sample Application");

		primaryStage.setScene(scene);

		primaryStage.show();

	}// end start

}
