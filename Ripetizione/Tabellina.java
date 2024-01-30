package it.edu.iisgubbio.Ripetizione;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application{
	
	TextField tNumero = new TextField();
	
	Label lTabelina= new Label();
	
	public void start(Stage finestra) {
	
		GridPane griglia= new GridPane();
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena= new Scene(griglia, 300, 250);
		
		scena.getStylesheets().add("it/edu/iisgubbio/Ripetizione/Tabellina.css");
		
		finestra.setScene(scena);
		finestra.setTitle("Tabellina");
		finestra.show();
		
		Button pCalcola= new Button("MOLTIPLICA");
		
		griglia.add(tNumero, 0, 0);
		griglia.add(pCalcola, 0, 1);
		griglia.add(lTabelina, 0, 2);
		
		pCalcola.setOnAction( e -> Calcola());
	}
	
	private void Calcola() {
		int n;
		int numero= Integer.parseInt(tNumero.getText());
		String Tabellina= " ";
		
		if (numero < 5) {
			tNumero.setId("Rosso");
		}
		if (numero > 5 && numero <=10) {
			tNumero.setId("Giallo");
		}
		if (numero > 10) {
			tNumero.setId("Verde");
		}
		
		
		for(n=1; n<= 10; n++) {
			Tabellina= Tabellina + numero*n +"; ";
		}
		lTabelina.setText(Tabellina);
	}
	
	public static void main (String [] args) {
		launch(args);
	}
}
