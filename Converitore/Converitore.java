package it.edu.iisgubbio.Converitore;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Converitore extends Application{

	public void start(Stage finestra) throws Exception {

		GridPane griglia= new GridPane();
		
		Scene scena = new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("Converitore");
		finestra.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
